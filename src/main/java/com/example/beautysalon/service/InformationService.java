package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.InformationMapper;
import com.example.beautysalon.mbg.model.Information;
import com.example.beautysalon.mbg.model.InformationExample;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.vo.InformationVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Lee
 * @date 2021.5.10  21:03
 * @description
 */
@Service
public class InformationService {
    @Resource
    private InformationMapper informationMapper;

    public List<InformationVo> getAllInformation(String key, Integer pageNum) {
        int pageSize = 5;
        List<Information> informationList = getInformationQuantities(key);
        List<InformationVo> informationVoList = new ArrayList<>();
        informationList.forEach(information -> {
            InformationVo informationVo = new InformationVo();
            informationVo.setId(information.getId());
            informationVo.setTitle(information.getTitle());
            informationVo.setContent(information.getContent());
            informationVo.setWebView(information.getWebView().replace("\\", ""));
            informationVo.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(information.getCreateDate()));
            informationVoList.add(informationVo);
        });
        int end = pageNum * pageSize;
        if (end > informationVoList.size()) {
            end = informationVoList.size();
        }
        List<InformationVo> result = new ArrayList<>();
        for (int i = (pageNum - 1) * pageSize; i < end; i++) {
            result.add(informationVoList.get(i));
        }
        return result;
    }

    public List<Information> getInformationQuantities(String key) {
        List<Information> informationList = informationMapper.selectByExampleWithBLOBs(new InformationExample());
        if (!"".equals(key)) {
            for (int i = 0; i < informationList.size(); i++) {
                String title = informationList.get(i).getTitle();
                String content = informationList.get(i).getContent();
                if (!title.contains(key) && !content.contains(key)) {
                    informationList.remove(i);
                    i--;
                }
            }
        }
        return informationList;
    }

    public ResponseBody getInformationData() {
        List<Information> informationList = informationMapper.selectByExampleWithBLOBs(new InformationExample());
        if (informationList != null) {
            return new ResponseBody(ResponseCode.REQUEST_INFORMATION_DATA_SUCCESS, informationList);
        }
        return new ResponseBody(ResponseCode.REQUEST_INFORMATION_DATA_FAILED, "");
    }

    public int updateInformation(InformationVo informationVo) {
        Information information = informationMapper.selectByPrimaryKey(informationVo.getId());
        if (information == null) {
            return -1;
        }
        information.setContent(informationVo.getContent());
        information.setTitle(informationVo.getTitle());
        information.setWebView(informationVo.getWebView());
        return informationMapper.updateByPrimaryKeyWithBLOBs(information);
    }

    public int deleteInformation(Integer id) {
        return informationMapper.deleteByPrimaryKey(id);
    }

    public int addInformation(InformationVo informationVo) {
        Information information = new Information();
        information.setTitle(informationVo.getTitle());
        information.setContent(informationVo.getContent());
        information.setWebView(informationVo.getWebView());
        information.setCreateDate(new Date());
        if (informationMapper.insert(information) != -1) {
            return information.getId();
        }
        return -1;
    }
}
