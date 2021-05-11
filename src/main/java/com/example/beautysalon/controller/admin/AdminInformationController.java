package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.InformationService;
import com.example.beautysalon.vo.InformationVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lee
 * @date 2021.5.3  00:10
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminInformationController {

    @Resource
    private InformationService informationService;


    @GetMapping("/information")
    public String toAdminInformation(){
        return "information";
    }

    @CrossOrigin
    @GetMapping("/allInformation")
    @ResponseBody
    public List<InformationVo> getAllInformation(@RequestParam String key, @RequestParam Integer page){
        return informationService.getAllInformation(key, page);
    }

    @CrossOrigin
    @GetMapping("/informationQuantities")
    @ResponseBody
    public int getInformationQuantities(@RequestParam String key) {
        return informationService.getInformationQuantities(key).size();
    }

    @CrossOrigin
    @PostMapping("/updateInformation")
    @ResponseBody
    public int updateInformation(InformationVo informationVo) {
        return informationService.updateInformation(informationVo);
    }

    @CrossOrigin
    @GetMapping("/deleteInformation")
    @ResponseBody
    public int deleteInformation(@RequestParam Integer id) {
        return informationService.deleteInformation(id);
    }

    @CrossOrigin
    @PostMapping("/addInformation")
    @ResponseBody
    public int addInformation(InformationVo informationVo) {
        return informationService.addInformation(informationVo);
    }
}
