package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.AdminMapper;
import com.example.beautysalon.mbg.model.Admin;
import com.example.beautysalon.mbg.model.AdminExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lee
 * @date 2021.5.12  19:22
 * @description
 */
@Service
public class LoginService {
    @Resource
    private AdminMapper adminMapper;

    public int login(Admin admin) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria()
                .andNameEqualTo(admin.getName())
                .andPasswordEqualTo(admin.getPassword());
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        return adminList.size();
    }
}
