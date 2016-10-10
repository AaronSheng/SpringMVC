package com.aaron.controller;

import com.aaron.service.RankService;
import com.aaron.service.RankServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aaron Sheng on 10/7/16.
 */
@Controller
@RequestMapping(value = "/rank")
public class RankController {
    private static final Logger logger = Logger.getLogger(RankController.class);

    @Autowired
    private RankService rankService;

    @RequestMapping(value = "/addScore", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject addScore(@RequestParam("id")Long id, @RequestParam("score")Long score) {
        rankService.addScore(id, score);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        return jsonObject;
    }

    @RequestMapping(value = "/getRank", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getRank(@RequestParam("score")Long score) {
        Long rank = rankService.getRank(score);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        jsonObject.put("rank", rank);
        return jsonObject;
    }

    @RequestMapping(value = "/deleteRank", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject deleteRank(@RequestParam("id")Long id) {
        rankService.deleteRank(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "ok");
        return jsonObject;
    }
}
