package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 64457 on 2017/7/3.
 */
@Controller
public class User2Controller {
    private static final Log logger = LogFactory.getLog(User2Controller.class);

    @ModelAttribute
    public void userMode2(ModelMap modelMap){
        logger.info("ueserModel2");
        User user = new User();
        user.setLoginname("644574747");
        user.setPassword("y6t5r4e3w2q1");
        modelMap.addAttribute("user", user);
    }

    @RequestMapping(value = "/login2")
    public String login2(ModelMap modelMap){
        logger.info("login2");

        User user = (User) modelMap.get("user");
        user.setUsername("测试");
        System.out.println(user);
        return "result2";
    }
}
