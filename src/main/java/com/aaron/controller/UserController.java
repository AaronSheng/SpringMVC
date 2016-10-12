package com.aaron.controller;

import com.aaron.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aaron Sheng on 10/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getName(@RequestParam("id")long id) {
        String name = userService.getName(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        jsonObject.put("name", name);
        return jsonObject;
    }

    @RequestMapping(value = "/setName", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject setName(@RequestParam("id")long id, @RequestParam("name")String name) {
        userService.setName(id, name);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        jsonObject.put("result", "success");
        return jsonObject;
    }
}
