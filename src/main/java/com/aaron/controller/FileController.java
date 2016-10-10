package com.aaron.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Aaron Sheng on 10/3/16.
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {
    private static Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject uploadFile(@RequestParam("file")MultipartFile multipartFile) {
        System.out.println(multipartFile.getOriginalFilename() + " size:" + multipartFile.getSize());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        jsonObject.put("result", "success");
        return jsonObject;
    }

    @RequestMapping(value = "/uploadFiles", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject uploadFiles(@RequestParam("file")MultipartFile[] multipartFiles) {
        for (MultipartFile multipartFile : multipartFiles) {
            System.out.println(multipartFile.getOriginalFilename() + " size:" + multipartFile.getSize());
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        jsonObject.put("result", "success");
        return jsonObject;
    }
}
