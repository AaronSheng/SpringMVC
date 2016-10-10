package com.aaron.controller;

import com.aaron.service.OnlineUserService;
import com.aaron.service.OnlineUserServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aaron Sheng on 10/5/16.
 */
@Controller
@RequestMapping(value = "/online")
public class OnlineController {
    private static final Logger logger = Logger.getLogger(OnlineController.class);

    @Autowired
    private OnlineUserService onlineUserService;

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getName(@RequestParam("id")long id) {
        String name = onlineUserService.getName(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        jsonObject.put("name", name);
        return jsonObject;
    }

    @RequestMapping(value = "/setName", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject setName(@RequestParam("id")long id, @RequestParam("name")String name) {
        onlineUserService.setName(id, name);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        return jsonObject;
    }
}
