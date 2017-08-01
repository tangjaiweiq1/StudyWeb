package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by 64457 on 2017/7/11.
 */
@Controller
@SessionAttributes("user")
public class SessionAttributesController {
    private static final Log logger = LogFactory.getLog(SessionAttributes.class);

//    @RequestMapping(value="/{fromName}")
//    public String loginFrom(@PathVariable String fromName){
//        return fromName;
//    }

    @RequestMapping(value="/login")
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model){
        logger.info("SessionAttributes被测试");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("tangjiawei");
        model.addAttribute("user", user);
        return "welcome";
    }
}
