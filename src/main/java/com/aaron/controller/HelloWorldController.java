package com.aaron.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aaron Sheng on 10/11/16.
 */
@Controller
@RequestMapping(value = "helloworld")
public class HelloWorldController {
    private static Logger logger = Logger.getLogger(HelloWorldController.class);

    @RequestMapping(value = "get", method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return "Hello World!";
    }
}
