package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @RequestMapping("/HelloWorld")
    public String HelloWorld(Model model){
        logger.info("helloworld被调用");
        model.addAttribute("message","Hello World!");
        return "helloWorld";
    }
}
