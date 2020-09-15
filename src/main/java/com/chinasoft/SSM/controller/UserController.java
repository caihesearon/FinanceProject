package com.chinasoft.SSM.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasoft.SSM.service.IUserService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/showCity")
    @ResponseBody
    public List<Map<String, Object>> toIndex(HttpServletRequest request) {
        List<Map<String, Object>> maps = userService.selectCityAll();
        System.out.println(maps);
        return maps;
    }

}
