package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.BarbershopMapper;
import com.example.beautysalon.mbg.mapper.StylistMapper;
import com.example.beautysalon.mbg.mapper.TurnoverMapper;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.vo.BarbershopVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author Lee
 * @date 2021.3.25  02:22
 * @description
 */
@Service
public class BarbershopService {
    @Resource
    private BarbershopMapper barbershopMapper;
    @Resource
    private StylistMapper stylistMapper;
    @Resource
    private TurnoverMapper turnoverMapper;

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

    public List<BarbershopVo> getAllBarbershop(String key, Integer pageNum) {
        int pageSize = 5;
        List<Barbershop> barbershopList = getBarbershopQuantities(key);
        List<BarbershopVo> barbershopVoList = new ArrayList<>();
        barbershopList.forEach(barbershop -> {
            BarbershopVo barbershopVo = new BarbershopVo();
            barbershopVo.setBarbershopId(barbershop.getBarbershopId());
            barbershopVo.setBarbershopName(barbershop.getBarbershopName());
            barbershopVo.setAddress(barbershop.getAddress());
            barbershopVo.setOpen(new SimpleDateFormat("HH:mm").format(barbershop.getOpen()));
            barbershopVo.setClose(new SimpleDateFormat("HH:mm").format(barbershop.getClose()));
            barbershopVoList.add(barbershopVo);
        });
        int end = pageNum * pageSize;
        if (end > barbershopVoList.size()) {
            end = barbershopVoList.size();
        }
        List<BarbershopVo> result = new ArrayList<>();
        for (int i = (pageNum - 1) * pageSize; i < end; i++) {
            result.add(barbershopVoList.get(i));
        }
        return result;
    }

    public List<Barbershop> getBarbershopQuantities(String key) {
        key = "%" + key + "%";
        BarbershopExample example = new BarbershopExample();
        BarbershopExample.Criteria criteria = new BarbershopExample().createCriteria();
        example.setOrderByClause("barbershop_id desc");
        example.createCriteria().andBarbershopNameLike(key);
        criteria.andAddressLike(key);
        example.or(criteria);
        return barbershopMapper.selectByExample(example);
    }

    public int updateBarbershop(BarbershopVo barbershopVo) throws ParseException {
        Barbershop barbershop = barbershopMapper.selectByPrimaryKey(barbershopVo.getBarbershopId());
        if (barbershop != null) {
            barbershop.setBarbershopName(barbershopVo.getBarbershopName());
            barbershop.setAddress(barbershopVo.getAddress());
            barbershop.setOpen(new SimpleDateFormat("HH:mm").parse(barbershopVo.getOpen()));
            barbershop.setClose(new SimpleDateFormat("HH:mm").parse(barbershopVo.getClose()));
            return barbershopMapper.updateByPrimaryKeySelective(barbershop);
        }
        return -1;
    }

    public int addBarbershop(BarbershopVo barbershopVo) throws ParseException {
        Barbershop barbershop = new Barbershop();
        barbershop.setBarbershopName(barbershopVo.getBarbershopName());
        barbershop.setAddress(barbershopVo.getAddress());
        barbershop.setOpen(new SimpleDateFormat("HH:mm").parse(barbershopVo.getOpen()));
        barbershop.setClose(new SimpleDateFormat("HH:mm").parse(barbershopVo.getClose()));
        barbershop.setOwnerId(1);
        if (barbershopMapper.insertSelective(barbershop) != -1) {
            return barbershop.getBarbershopId();
        }
        return -1;
    }

    public int deleteBarbershop(Integer barbershopId) {
        StylistExample stylistExample = new StylistExample();
        stylistExample.createCriteria()
                .andBarbershopIdEqualTo(barbershopId);
        List<Stylist> stylistList = stylistMapper.selectByExample(stylistExample);


        if (stylistList != null && stylistList.size() > 0) {
            return -1;
        }
        if (barbershopMapper.deleteByPrimaryKey(barbershopId) == -1) {
            return -1;
        }

        TurnoverExample turnoverExample = new TurnoverExample();
        turnoverExample.createCriteria()
                .andBarbershopIdEqualTo(barbershopId);
        List<Turnover> turnoverList = turnoverMapper.selectByExample(turnoverExample);
        turnoverList.stream().filter(Objects::nonNull).forEach(turnover -> {
            turnoverMapper.deleteByPrimaryKey(turnover.getId());
        });
        return 1;
    }
}
