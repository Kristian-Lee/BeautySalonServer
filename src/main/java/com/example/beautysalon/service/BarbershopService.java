package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.BarbershopMapper;
import com.example.beautysalon.mbg.model.Barbershop;
import com.example.beautysalon.mbg.model.BarbershopExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Lee
 * @date 2021.3.25  02:22
 * @description
 */
@Service
public class BarbershopService {
    @Resource
    private BarbershopMapper barbershopMapper;

    public HashMap<String, Integer> selectBarbershopName() {
        List<Barbershop> barbershops = barbershopMapper.selectByExample(new BarbershopExample());
        System.out.println(barbershops.size());
        if (barbershops != null && barbershops.size() > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < barbershops.size(); i++) {
                map.put(barbershops.get(i).getBarbershopName(), barbershops.get(i).getBarbershopId());
            }
            return map;
        } else {
            return null;
        }
    }

    public List<String> getAllBarbershopName() {
        List<Barbershop> barbershopList = barbershopMapper.selectByExample(new BarbershopExample());
        List<String> name = new ArrayList<>();
        barbershopList.forEach(barbershop -> {
            name.add(barbershop.getBarbershopName());
        });
        return name;
    }
}
