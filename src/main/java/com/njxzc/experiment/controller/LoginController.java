package com.njxzc.experiment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * projectName:  experiment
 * packageName: com.njxzc.experiment.controller
 * date: 2020-09-12 21:13
 * copyright(c) 2020 南晓18卓工 邱依良
 */
@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password")String password , Map<String,Object>map){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "dashboard";
        }else{
            map.put("msg","用户名错误");
            return "index";
        }
    }
}