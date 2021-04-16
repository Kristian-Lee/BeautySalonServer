package com.example.beautysalon.service;

import com.alibaba.fastjson.JSON;
import com.example.beautysalon.dto.CommentDTO;
import com.example.beautysalon.dto.ReservationDTO;
import com.example.beautysalon.mbg.mapper.*;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.util.CommonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Lee
 * @date 2021.3.24  13:41
 * @description
 */
@Service
public class StylistService {
    @Resource
    private EvaluationMapper evaluationMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private StylistMapper stylistMapper;
    @Resource
    private ReserveMapper reserveMapper;
    @Resource
    private BarbershopMapper barbershopMapper;
    @Resource
    private RedisService redisService;
    @Resource
    private CommentMapper commentMapper;

    /** 根据手机号判断用户是否存在 */
    public boolean existAccount(Stylist stylist) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andPhoneEqualTo(stylist.getPhone());
        List<User> users = userMapper.selectByExample(userExample);

        return users != null && users.size() > 0 && selectByPhone(stylist.getPhone()) != null;
    }

    /** 新增发型师 */
    public Stylist insertStylist(Stylist stylist) {

        stylist.setAvatar("http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1618320220475.jpg");
        stylistMapper.insert(stylist);
        Evaluation evaluation = new Evaluation();
        evaluation.setRate(5.f);
        evaluation.setQuantities(0);
        evaluation.setPopularity(100.00f);
        evaluation.setPositive(0);
        evaluation.setStylistId(stylist.getStylistId());
        evaluationMapper.insert(evaluation);
        return stylist;
    }

    public HashMap<String, Object> selectUser(User user) {
        StylistExample stylistExample = new StylistExample();
        HashMap<String, Object> map = new HashMap<>();
        stylistExample.createCriteria()
                .andStylistNameEqualTo(user.getUserName())
                .andPasswordEqualTo(user.getPassword());
        List<Stylist> stylists = stylistMapper.selectByExample(stylistExample);
        if (stylists != null && stylists.size() > 0) {
            map.put("phone", stylists.get(0).getPhone());
            String token = CommonUtil.encrypt(stylists.get(0).getStylistId() + stylists.get(0).getPassword());
            map.put("token", token);
            map.put("stylist", JSON.toJSONString(stylists.get(0)));
            return map;
        }
        return null;
    }

    public Stylist selectByPrimaryKey(int stylistId) {
        return stylistMapper.selectByPrimaryKey(stylistId);
    }

    public Stylist selectByPhone(String phone) {
        StylistExample stylistExample = new StylistExample();
        stylistExample.createCriteria()
                .andPhoneEqualTo(phone);
        List<Stylist> stylists = stylistMapper.selectByExample(stylistExample);
        if (stylists != null && stylists.size() > 0) {
            return stylists.get(0);
        }
        return null;
    }

    public List<Stylist> selectAllStylist() {
        return stylistMapper.selectByExample(new StylistExample());
    }

    public List<Evaluation> selectAllEvaluation() {
        return evaluationMapper.selectByExample(new EvaluationExample());
    }

    public HashMap<String, Object> selectMainData() {
        HashMap<String, Object> map = new HashMap<>();
        List<Stylist> stylistList = selectAllStylist();
        List<Evaluation> evaluationList = selectAllEvaluation();
        if (stylistList != null && evaluationList != null) {
            map.put("stylist", stylistList);
            map.put("evaluation", evaluationList);
            return map;
        }
        return null;
    }

    public ResponseBody getStylistReservation(Stylist stylist, String type) throws ParseException {
        ReserveExample reserveExample = new ReserveExample();
        ReserveExample.Criteria criteria = reserveExample.createCriteria();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tomorrow = new Date(simpleDateFormat.parse(simpleDateFormat.format(new Date())).getTime() + 86399000);
        criteria.andStylistIdEqualTo(stylist.getStylistId())
                .andStatusEqualTo(1);
        switch (type) {
            case "today":
                criteria.andServeDateBetween(new Date(), tomorrow);
                break;
            case "tomorrow":
                criteria.andServeDateGreaterThan(tomorrow);
                break;
            default:
                break;
        }

        List<Reserve> reserveList = reserveMapper.selectByExample(reserveExample);
        if (reserveList != null) {
            HashMap<String, Object> map = new HashMap<>();
            List<User> userList = new ArrayList<>();
            if (reserveList.size() > 0) {
                for (Reserve reserve: reserveList) {
                    userList.add(userMapper.selectByPrimaryKey(reserve.getUserId()));
                }
                System.out.println("共" + reserveList.size() + "个预约");
            }
            map.put("reserve", reserveList);
            map.put("user", userList);
            return new ResponseBody(ResponseCode.REQUEST_STYLIST_RESERVATION_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_STYLIST_RESERVATION_FAILED, "");
    }

    public ResponseBody getStylistMainData(Stylist stylist) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("stylist", stylistMapper.selectByPrimaryKey(stylist.getStylistId()));
        EvaluationExample example = new EvaluationExample();
        example.createCriteria().andStylistIdEqualTo(stylist.getStylistId());
        List<Evaluation> evaluationList = evaluationMapper.selectByExample(example);
        map.put("evaluation", evaluationList.get(0));
        map.put("barbershop", barbershopMapper.selectByPrimaryKey(stylist.getBarbershopId()));
        return new ResponseBody(ResponseCode.REQUEST_STYLIST_MAIN_DATA_SUCCESS, map);
    }

    public ResponseBody updateStylist(Stylist stylist, String token) {
        StylistExample stylistExample = new StylistExample();
        stylistExample.createCriteria()
                .andStylistIdNotEqualTo(stylist.getStylistId())
                .andPhoneEqualTo(stylist.getPhone());
        List<Stylist> stylistList = stylistMapper.selectByExample(stylistExample);
        if (stylistList != null && stylistList.size() > 0) {
            return new ResponseBody(ResponseCode.PHONE_EXIST_ERROR, "");
        }
        if (stylistMapper.updateByPrimaryKeySelective(stylist) == 1) {
            redisService.set(token, stylist.getPhone(), 86400L);
            return new ResponseBody(ResponseCode.UPDATE_STYLIST_SUCCESS, stylist);
        }
        return new ResponseBody(ResponseCode.UPDATE_USER_FAILED, "");
    }

    public ResponseBody getUserComment(Stylist stylist, String type) {
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andStylistIdEqualTo(stylist.getStylistId());
        switch (type) {
            case "good":
                criteria.andRateGreaterThanOrEqualTo(3.0f);
                break;
            case "bad":
                criteria.andRateLessThan(3.0f);
                break;
            default:
                break;
        }
        List<Comment> commentList = commentMapper.selectByExample(commentExample);
        if (commentList != null) {
            List<Reserve> reserveList = new ArrayList<>();
            List<User> userList = new ArrayList<>();
            if (commentList.size() > 0) {
                for (Comment comment: commentList) {
                    reserveList.add(reserveMapper.selectByPrimaryKey(comment.getOrderId()));
                    userList.add(userMapper.selectByPrimaryKey(comment.getUserId()));
                }
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put("reserve", reserveList);
            map.put("comment", commentList);
            map.put("user", userList);
            return new ResponseBody(ResponseCode.REQUEST_USER_COMMENT_DATA_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_USER_COMMENT_DATA_FAILED, "");
    }

    public ResponseBody getReservationCommentData(Stylist stylist) {
        ReserveExample reserveExample = new ReserveExample();
        reserveExample.createCriteria()
                .andStylistIdEqualTo(stylist.getStylistId())
                .andStatusIn(Arrays.asList(1, 2))
                .andServeDateLessThanOrEqualTo(new Date());
        List<Reserve> reserveList = reserveMapper.selectByExample(reserveExample);
        if (reserveList != null) {
            List<ReservationDTO> reservationDTOList = new ArrayList<>();
            List<Object> result = new ArrayList<>();
            if (reserveList.size() > 0) {
                for (Reserve reserve: reserveList) {
                    ReservationDTO reservationDTO = new ReservationDTO();
                    reservationDTO.setReservationId(reserve.getId());
                    reservationDTO.setServices(reserve.getServices());
                    User user = userMapper.selectByPrimaryKey(reserve.getUserId());
                    reservationDTO.setUserName(user.getUserName());
                    reservationDTO.setHobby(user.getHobby());
                    reservationDTO.setServeDate(reserve.getServeDate());
                    reservationDTOList.add(reservationDTO);
                    List<CommentDTO> commentDTOList = new ArrayList<>();
                    CommentExample commentExample = new CommentExample();
                    commentExample.createCriteria()
                            .andOrderIdEqualTo(reserve.getId());
                    List<Comment> commentList = commentMapper.selectByExample(commentExample);
                    if (commentList != null && commentList.size() > 0) {
                        for (Comment comment: commentList) {
                            CommentDTO commentDTO = new CommentDTO();
                            commentDTO.setCommentId(comment.getId());
                            commentDTO.setContact(comment.getContact());
                            commentDTO.setStylistId(comment.getStylistId());
                            commentDTO.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(comment.getCreateDate()));
                            commentDTO.setRate(comment.getRate());
                            commentDTO.setUserAvatar(user.getAvatar());
                            commentDTO.setUserName(user.getUserName());
                            commentDTO.setUserId(user.getUserId());
                            commentDTO.setOrderId(comment.getOrderId());
                            commentDTOList.add(commentDTO);
                        }
                        System.out.println(commentDTOList.size() + "条评价");
                    }
                    result.add(commentDTOList);
                }
                System.out.println(result.size() + "个服务单");
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put("reservation", reservationDTOList);
            map.put("comment", result);
            return new ResponseBody(ResponseCode.REQUEST_RESERVATION_COMMENT_DATA_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_RESERVATION_COMMENT_DATA_FAILED, "");
    }
}
