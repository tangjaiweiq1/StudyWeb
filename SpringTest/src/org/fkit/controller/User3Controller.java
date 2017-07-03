package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 64457 on 2017/7/3.
 */
@Controller
public class User3Controller {
    private static final Log logger = LogFactory.getLog(User3Controller.class);

    @ModelAttribute
    public void userMode3(ModelAndView modelAndView){
        logger.info("userMode3");

        User user = new User();
        user.setLoginname("18711025569");
        user.setPassword("tangjiawei");

        modelAndView.addObject("user", user);
    }

    @RequestMapping(value="/login3")
    public ModelAndView login3(ModelAndView modelAndView){
        logger.info("login3");

        User user = (User) modelAndView.getModel().get("user");
        user.setUsername("ModelAndView");

        System.out.println(user);

        modelAndView.setViewName("result3");
        return modelAndView;
    }

}
