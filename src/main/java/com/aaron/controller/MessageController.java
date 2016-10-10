package com.aaron.controller;

import com.aaron.service.MessageService;
import com.aaron.service.MessageServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aaron Sheng on 10/6/16.
 */
@Controller
@RequestMapping(value = "/message")
public class MessageController {
    private static Logger logger = Logger.getLogger(MessageController.class);

    @Autowired
   private MessageService messageService;

    @RequestMapping(value = "/addMessage", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject addMessage(@RequestParam("message")String message) {
        messageService.addMessage(message);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        return jsonObject;
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getMessage() {
        String message = messageService.getMessage();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        jsonObject.put("message", message);
        return jsonObject;
    }
}
