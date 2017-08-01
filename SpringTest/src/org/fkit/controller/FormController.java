package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 64457 on 2017/7/31.
 */
@Controller
public class FormController {
    @RequestMapping(value="/{formName}")
    public String loginFrom(@PathVariable String formName){
        return formName;
    }
}
