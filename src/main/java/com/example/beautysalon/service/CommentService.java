package com.example.beautysalon.service;

import com.alibaba.fastjson.JSON;
import com.example.beautysalon.dto.CommentDTO;
import com.example.beautysalon.mbg.mapper.*;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Lee
 * @date 2021.3.28  21:31
 * @description
 */
@Service
public class CommentService {

    @Resource
    private CommentMapper commentMapper;
    @Resource
    private BarbershopMapper barbershopMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private ReserveMapper reserveMapper;
    @Resource
    private EvaluationMapper evaluationMapper;
    @Resource
    private StylistMapper stylistMapper;

    public ResponseBody selectCommentByStylist(String map) {

        HashMap<String, Object> myMap = JSON.parseObject(map, HashMap.class);

        Stylist stylist = JSON.parseObject(myMap.get("stylist").toString(), Stylist.class);
        Integer userId = (Integer) myMap.get("userId");

        HashMap<String, Object> resultMap = new HashMap<>();
        ReserveExample reserveExample = new ReserveExample();
        reserveExample.createCriteria()
                .andStylistIdEqualTo(stylist.getStylistId())
                .andUserIdEqualTo(userId)
                .andServeDateGreaterThan(new Date())
                .andStatusIn(Arrays.asList(0, 1));
        List<Reserve> reserveList = reserveMapper.selectByExample(reserveExample);
        if (reserveList != null && reserveList.size() > 0) {
            resultMap.put("reserve", reserveList.get(0));
        }


        Barbershop barbershop = barbershopMapper.selectByPrimaryKey(stylist.getBarbershopId());
        if (barbershop == null) {
            return new ResponseBody(ResponseCode.REQUEST_COMMENT_DATA_FAILED, "");
        }

        List<CommentDTO> commentDTOList = new ArrayList<>();
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria()
                .andStylistIdEqualTo(stylist.getStylistId());
        commentMapper.selectByExample(commentExample);
        List<Comment> commentList = commentMapper.selectByExample(commentExample);
        if (commentList != null && commentList.size() > 0) {
            for (Comment comment: commentList) {
                CommentDTO commentDTO = new CommentDTO();
                User user = userMapper.selectByPrimaryKey(comment.getUserId());
                commentDTO.setCommentId(comment.getId());
                commentDTO.setStylistId(comment.getStylistId());
                commentDTO.setOrderId(comment.getOrderId());
                commentDTO.setContact(comment.getContact());
                commentDTO.setRate(comment.getRate());
                commentDTO.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(comment.getCreateDate()));
                commentDTO.setUserId(user.getUserId());
                commentDTO.setUserName(user.getUserName());
                commentDTO.setUserAvatar(user.getAvatar());
                commentDTOList.add(commentDTO);
            }
        }
        resultMap.put("barbershop", JSON.toJSONString(barbershop));
        resultMap.put("comment", commentDTOList);
        return new ResponseBody(ResponseCode.REQUEST_COMMENT_DATA_SUCCESS, resultMap);

    }

    public ResponseBody insert(Comment comment) {
        commentMapper.insert(comment);
        EvaluationExample example = new EvaluationExample();
        example.createCriteria()
                .andStylistIdEqualTo(comment.getStylistId());
        List<Evaluation> evaluationList = evaluationMapper.selectByExample(example);
        if (evaluationList != null && evaluationList.size() > 0) {
            System.out.println(evaluationList.get(0).toString());
            Evaluation evaluation = evaluationList.get(0);
            Integer num = evaluation.getQuantities();
            Integer positive = evaluation.getPositive();
            float rate = (evaluation.getRate() * num + comment.getRate()) / (num + 1);
            if (comment.getRate() >= 3.0f) {
                positive += 1;
            }
            System.out.println(rate);
            float popularity = ((float) positive) / ((float) (num + 1)) * 100 ;
            evaluation.setPopularity(popularity);
            evaluation.setPositive(positive);
            evaluation.setRate(rate);
            evaluation.setQuantities(num + 1);
            evaluation.setStylistId(evaluation.getStylistId());
            evaluationMapper.updateByPrimaryKey(evaluation);
        }
        return new ResponseBody(ResponseCode.EVALUATE_SUCCESS, "");
    }

    public ResponseBody getUserComment(User user) {
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria()
                .andUserIdEqualTo(user.getUserId());
        List<Comment> commentList = commentMapper.selectByExample(commentExample);
        if (commentList != null) {
            HashMap<String, Object> map = new HashMap<>();
            List<Stylist> stylistList = new ArrayList<>();
            List<Reserve> reserveList = new ArrayList<>();
            for (Comment comment: commentList) {
                stylistList.add(stylistMapper.selectByPrimaryKey(comment.getStylistId()));
                reserveList.add(reserveMapper.selectByPrimaryKey(comment.getOrderId()));
            }
            map.put("comment", commentList);
            map.put("stylist", stylistList);
            map.put("reserve", reserveList);
            return new ResponseBody(ResponseCode.REQUEST_USER_COMMENT_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_USER_COMMENT_FAILED, "");
    }
}
