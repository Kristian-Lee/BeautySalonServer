package com.example.beautysalon.service;


import com.alibaba.fastjson.JSON;
import com.example.beautysalon.mbg.mapper.*;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.util.CommonUtil;
import com.example.beautysalon.vo.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author Lee
 * @date 2021.3.15  01:51
 * @description
 */

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private StylistMapper stylistMapper;
    @Resource
    private RedisService redisService;
    @Resource
    private SignInMapper signInMapper;
    @Resource
    private ReserveMapper reserveMapper;
    @Resource
    private CommentMapper commentMapper;
    @Resource
    private CouponMapper couponMapper;
    @Resource
    private PointsMapper pointsMapper;
    @Resource
    private BalanceMapper balanceMapper;

    public boolean existAccount(User user) {

        StylistExample stylistExample = new StylistExample();
        stylistExample.createCriteria()
                .andPhoneEqualTo(user.getPhone());
        List<Stylist> stylists = stylistMapper.selectByExample(stylistExample);
        return selectByPhone(user.getPhone()) != null && stylists != null && stylists.size() > 0;
    }

    public HashMap<String, Object> selectUser(User user) {
        UserExample userExample = new UserExample();
        HashMap<String, Object> map = new HashMap<>();
        userExample.createCriteria()
                .andUserNameEqualTo(user.getUserName())
                .andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(userExample);
        if (users != null && users.size() > 0) {
            map.put("phone", users.get(0).getPhone());
            String token = CommonUtil.encrypt(users.get(0).getUserId() + users.get(0).getPassword());
            map.put("token", token);
            map.put("user", JSON.toJSONString(users.get(0)));
            return map;
        }
        return null;
    }

    public User insertUser(User user) {
        userMapper.insert(user);
        return user;
    }

    public User selectByPrimaryKey(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public User selectByPhone(String phone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andPhoneEqualTo(phone);
        List<User> users = userMapper.selectByExample(userExample);
        if (users != null && users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    public ResponseBody getUserData(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user != null) {
            return new ResponseBody(ResponseCode.REQUEST_USER_DATA_SUCCESS, user);
        } else {
            return new ResponseBody(ResponseCode.REQUEST_USER_DATA_FAILED, "");
        }
    }

    public List<UserVo> getAllUser(String key, Integer pageNum){
        int pageSize = 5;



        List<User> users = getUserQuantities(key);
        List<UserVo> userVos = new ArrayList<>();
        users.forEach(user -> {
            UserVo userVo = new UserVo();

            if (user.getBirthday() != null) {
                userVo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday()));
            }
            SignInExample signInExample = new SignInExample();
            signInExample.createCriteria()
                    .andUserIdEqualTo(user.getUserId());
            List<SignIn> signInList = signInMapper.selectByExample(signInExample);
            if (signInList != null && signInList.size() > 0) {
                userVo.setLastSignIn(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(signInList.get(0).getLastDate()));
            }
            userVo.setUserId(user.getUserId());
            userVo.setUsername(user.getUserName());
            userVo.setPhone(user.getPhone());
            userVo.setHobby(user.getHobby());
            userVo.setPoints(user.getPoints());
            userVo.setBalance(user.getMoney());
            userVos.add(userVo);
        });
        int end = pageNum * pageSize;
        if (end > userVos.size()) {
            end = userVos.size();
        }
        List<UserVo> result = new ArrayList<>();
        System.out.println("page" + pageNum);
        System.out.println((pageNum - 1) * pageSize);
        System.out.println(end);
        for (int i = (pageNum - 1) * pageSize; i < end; i++) {
            result.add(userVos.get(i));
        }
        System.out.println("共" + result.size() + "个数据");
        return result;
    }

    public List<UserVo> searchUser(String query) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneLike("%" + query + "%");
        List<User> userList = userMapper.selectByExample(userExample);

        List<UserVo> userVoList = new ArrayList<>();
        userList.forEach(user -> {
            UserVo userVo = new UserVo();

            if (user.getBirthday() != null) {
                userVo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday()));
            }
            SignInExample signInExample = new SignInExample();
            signInExample.createCriteria()
                    .andUserIdEqualTo(user.getUserId());
            List<SignIn> signInList = signInMapper.selectByExample(signInExample);
            if (signInList != null && signInList.size() > 0) {
                userVo.setLastSignIn(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(signInList.get(0).getLastDate()));
            }
            userVo.setUserId(user.getUserId());
            userVo.setUsername(user.getUserName());
            userVo.setPhone(user.getPhone());
            userVo.setHobby(user.getHobby());
            userVo.setPoints(user.getPoints());
            userVo.setBalance(user.getMoney());
            userVoList.add(userVo);
        });
        System.out.println(query);
        System.out.println(userVoList.size());
        return userVoList;
    }




    public String deleteUser(Integer userId){
        ReserveExample reserveExample = new ReserveExample();
        reserveExample.createCriteria()
                .andUserIdEqualTo(userId);
        if (reserveMapper.selectByExample(reserveExample).size() > 0) {
            return "删除失败，该用户仍绑定有关联数据";
        }

        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria()
                .andUserIdEqualTo(userId);
        if (commentMapper.selectByExample(commentExample).size() > 0) {
            return "删除失败，该用户仍绑定有关联数据";
        }


        int i = userMapper.deleteByPrimaryKey(userId);
        if (i == -1){
            return "删除失败";
        } else {
            SignInExample signInExample = new SignInExample();
            signInExample.createCriteria()
                    .andUserIdEqualTo(userId);
            List<SignIn> signInList = signInMapper.selectByExample(signInExample);
            if (signInList != null && signInList.size() > 0) {
                signInMapper.deleteByPrimaryKey(signInList.get(0).getId());
            }


            CouponExample couponExample = new CouponExample();
            couponExample.createCriteria()
                    .andUserIdEqualTo(userId);
            List<Coupon> couponList = couponMapper.selectByExample(couponExample);
            couponList.stream().filter(Objects::nonNull).forEach(coupon -> {
                couponMapper.deleteByPrimaryKey(coupon.getId());
            });

            PointsExample pointsExample = new PointsExample();
            pointsExample.createCriteria()
                    .andUserIdEqualTo(userId);
            List<Points> pointsList = pointsMapper.selectByExample(pointsExample);
            pointsList.stream().filter(Objects::nonNull).forEach(points -> {
                pointsMapper.deleteByPrimaryKey(points.getId());
            });

            BalanceExample balanceExample = new BalanceExample();
            balanceExample.createCriteria()
                    .andUserIdEqualTo(userId);
            List<Balance> balanceList = balanceMapper.selectByExample(balanceExample);
            balanceList.stream().filter(Objects::nonNull).forEach(balance-> {
                balanceMapper.deleteByPrimaryKey(balance.getId());
            });
        }
        return "删除成功";
    }

    public int updateUser(UserVo userVo) throws ParseException {
        User user = new User();

        user.setUserId(userVo.getUserId());
        user.setUserName(userVo.getUsername());
        if (userVo.getBirthday() != null && userVo.getBirthday().equals("")) {
            user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(userVo.getBirthday()));
        }
        user.setHobby(userVo.getHobby());
        user.setPoints(userVo.getPoints());
        user.setMoney(userVo.getBalance());
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public ResponseBody updateUser(User user, String token) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andUserIdNotEqualTo(user.getUserId())
                .andPhoneEqualTo(user.getPhone());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            return new ResponseBody(ResponseCode.PHONE_EXIST_ERROR, "");
        }
        if (userMapper.updateByPrimaryKeySelective(user) == 1) {
            redisService.set(token, user.getPhone(), 86400L);
            redisService.set(user.getPhone(), "user", 86400L);
            return new ResponseBody(ResponseCode.UPDATE_USER_SUCCESS, user);
        }
        return new ResponseBody(ResponseCode.UPDATE_USER_FAILED, "");
    }

    public boolean updateAvatar(MultipartFile file, String filename) {
        String dir = "D:\\pics";
        if (file == null || file.isEmpty() || filename == null || filename.isEmpty()) {
            return false;
        }
        try (InputStream inputStream = file.getInputStream()) {
            Path uploadPath = Paths.get("avatar");
            if (!uploadPath.toFile().exists()) {
                uploadPath.toFile().mkdirs();
            }
            Files.copy(inputStream, Paths.get(dir).resolve(filename), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("头像上传成功 " + filename);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int addUser(UserVo userVo) throws ParseException {

        User user = new User();

        if (!"".equals(userVo.getBirthday())) {
            user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(userVo.getBirthday()));
        }
        if (!"".equals(userVo.getHobby())) {
            user.setHobby(userVo.getHobby());
        }

        user.setUserName(userVo.getUsername());
        user.setPoints(0);
        user.setMoney(0.f);
        user.setPhone(userVo.getPhone());
        user.setRole(0);
        user.setPassword(CommonUtil.encrypt("123456"));
        user.setAvatar("http://www.xiaobais.net:8080/image/dd9636aedf8f196b1924830f6bd545a4/avatar/1618320453810.jpg");

        //查有没有重复用户
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(user.getPhone());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            return -1;
        }
        if (userMapper.insert(user) != -1) {
            return user.getUserId();
        } else {
            return -1;
        }
    }

    public List<User> getUserQuantities(String key) {
        UserExample userExample = new UserExample();
        UserExample userExample1 = new UserExample();
        UserExample.Criteria criteria = userExample1.createCriteria();
        if (!"".equals(key)) {
            userExample.createCriteria().andPhoneLike("%" + key + "%");
            criteria.andUserNameLike("%" + key + "%");
            userExample.or(criteria);
        }
        userExample.setOrderByClause("user_id desc");
        List<User> userList = userMapper.selectByExample(userExample);
        return userList;
    }
}
