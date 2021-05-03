package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.TurnoverMapper;
import com.example.beautysalon.mbg.model.Turnover;
import com.example.beautysalon.mbg.model.TurnoverExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lee
 * @date 2021.4.21  13:51
 * @description
 */
@Service
public class TurnOverService {

    @Resource
    private TurnoverMapper turnoverMapper;

    public List<Float> getAllTurnOver() {
        TurnoverExample turnoverExample = new TurnoverExample();
        turnoverExample.createCriteria().andBarbershopIdEqualTo(5);
        List<Turnover> turnoverList = turnoverMapper.selectByExample(turnoverExample);
        List<Float> turnOver = new ArrayList<>();
        turnoverList.forEach(turnover -> {
            turnOver.add(turnover.getTotal());
        });
        return turnOver;
    }

    public List<Integer> getAllPassengerFlow() {
        TurnoverExample turnoverExample = new TurnoverExample();
        turnoverExample.createCriteria().andBarbershopIdEqualTo(5);
        List<Turnover> turnoverList = turnoverMapper.selectByExample(turnoverExample);
        List<Integer> passengerFlow = new ArrayList<>();
        turnoverList.forEach(turnover -> {
            passengerFlow.add(turnover.getPerson());
        });
        return passengerFlow;
    }

    public List<String> getDate() {
        TurnoverExample turnoverExample = new TurnoverExample();
        turnoverExample.createCriteria().andBarbershopIdEqualTo(5);
        List<Turnover> turnoverList = turnoverMapper.selectByExample(turnoverExample);
        List<String> dateList = new ArrayList<>();
        turnoverList.forEach(turnover -> {
            dateList.add(new SimpleDateFormat("yyyy-MM-dd").format(turnover.getCreateDate()));
        });
        return dateList;
    }
}
