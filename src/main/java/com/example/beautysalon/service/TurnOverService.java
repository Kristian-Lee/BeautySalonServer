package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.BarbershopMapper;
import com.example.beautysalon.mbg.mapper.TurnoverMapper;
import com.example.beautysalon.mbg.model.Barbershop;
import com.example.beautysalon.mbg.model.BarbershopExample;
import com.example.beautysalon.mbg.model.Turnover;
import com.example.beautysalon.mbg.model.TurnoverExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    @Resource
    private BarbershopMapper barbershopMapper;

    public List<Float> getAllTurnOver(String barbershopName) throws ParseException {
        List<Turnover> turnoverList = getTurnOverByWeeks(barbershopName);
        List<Float> turnOver = new ArrayList<>();
        turnoverList.forEach(turnover -> {
            turnOver.add(turnover.getTotal());
        });
        return turnOver;
    }

    public List<Integer> getAllPassengerFlow(String barbershopName) throws ParseException {
        List<Turnover> turnoverList = getTurnOverByWeeks(barbershopName);
        List<Integer> passengerFlow = new ArrayList<>();
        turnoverList.forEach(turnover -> {
            passengerFlow.add(turnover.getPerson());
        });
        return passengerFlow;
    }

    public List<Turnover> getTurnOverByWeeks(String barbershopName) throws ParseException {
        TurnoverExample turnoverExample = new TurnoverExample();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTo = format.parse(format.format(new Date()));
        Date dateFrom = new Date(dateTo.getTime() - 518400000L);
        BarbershopExample barbershopExample = new BarbershopExample();
        barbershopExample.createCriteria()
                .andBarbershopNameEqualTo(barbershopName);
        List<Barbershop> barbershopList = barbershopMapper.selectByExample(barbershopExample);
        turnoverExample.createCriteria()
                .andBarbershopIdEqualTo(barbershopList.get(0).getBarbershopId())
                .andCreateDateGreaterThanOrEqualTo(dateFrom)
                .andCreateDateLessThanOrEqualTo(dateTo);
        turnoverExample.setOrderByClause("create_date asc");
        return turnoverMapper.selectByExample(turnoverExample);
    }

    public List<String> getDate(String barbershopName) throws ParseException {
        TurnoverExample turnoverExample = new TurnoverExample();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTo = format.parse(format.format(new Date()));
        Date dateFrom = new Date(dateTo.getTime() - 518400000L);
        List<Turnover> turnoverList = getTurnOverByWeeks(barbershopName);
        List<String> dateList = new ArrayList<>();
        turnoverList.forEach(turnover -> {
            dateList.add(format.format(turnover.getCreateDate()));
        });
        BarbershopExample barbershopExample = new BarbershopExample();
        barbershopExample.createCriteria()
                .andBarbershopNameEqualTo(barbershopName);
        List<Barbershop> barbershopList = barbershopMapper.selectByExample(barbershopExample);
        for (int i = 0; i < 7; i++) {
            if (!dateList.contains(format.format(dateFrom))) {
                Turnover turnover = new Turnover();
                turnover.setCreateDate(dateFrom);
                turnover.setBarbershopId(barbershopList.get(0).getBarbershopId());
                turnover.setPerson(0);
                turnover.setTotal(0f);
                turnoverMapper.insert(turnover);
                dateList.add(i, format.format(dateFrom));
            }
            dateFrom = new Date(dateFrom.getTime() + 86400000L);
        }
        return dateList;
    }
}
