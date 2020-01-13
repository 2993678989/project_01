package com.zhiyou100.controller;

import com.zhiyou100.service.SpeakerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author:li
 * @Date:2019/10/10 15:41
 */
@Controller
@RequestMapping("speakerController")
public class SpeakerController {
    @Resource
    private SpeakerService speakerService;
    @RequestMapping("findQueryAll")
    public String findQueryAll(Model model){
        model.addAttribute("speakers",speakerService.findQueryAll());
        return "speaker/speakerShow";
    }
    @RequestMapping(value = "update.do")
    public String update(Model model, Integer id,String state){
        speakerService.update(id,state);
        return "forward:findQueryAll.do";
    }
    @RequestMapping("delete.do")
    public String delete(Model model,Integer id){
        speakerService.deleteById(id);
        return "forward:findQueryAll.do";
    }
}
