package com.chinasoft.SSM.controller;

import com.chinasoft.SSM.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/headNumber")
    public Object headNumber(HttpServletRequest request,@RequestBody Map<String,Object>  map){
        //Map<String,Object> map=getQueryMap(request);
        List<Map<String,Object>> list=userService.selectIndexPageHeadNumber(map);
        /*查询第二个SQL指令  并返回list查询结果集  最后把子list数据  add添加到List<Object>  data中
         * data是最后要返回前端页面的  json复合容器*/
        List<Map<String,Object>> list1=userService.selectCityCouponByCityId(map);

        List<Object>  data=new ArrayList<Object>();
        data.add(list.get(0));
        data.add(list1.get(0));
        return data;
    }


}
