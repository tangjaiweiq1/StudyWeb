package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 64457 on 2017/7/31.
 */
@Controller
public class ModelAttribute1Controller {
    @ModelAttribute("loginname")
    public String userModel1(@RequestParam("loginname") String loginname) {
        return loginname;
    }

    @RequestMapping(value="/modelLogin1")
    public String login1(){
        return "result1";
    }
}
