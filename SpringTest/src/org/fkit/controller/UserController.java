package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 64457 on 2017/7/2.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    //静态List<User>集合，此处代替数据库用来保存注册数据
    private static List<User> userlist;

    // User类的构造器，初始化list<User>集合
    public UserController(){
        super();
        userlist = new ArrayList<User>();
    }

    // Logger
    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value="/register",method= RequestMethod.GET)
    public String registerFrom(){
        logger.info("register的Get被调用");
        // 跳转注册页面
        return "registerFrom";
    }

    // 支持Post请求
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String register(@RequestParam("loginname") String loginname,
                           @RequestParam("password") String password,
                           @RequestParam("username") String username){
        logger.info("register的Post被调用");
        User user= new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);

        userlist.add(user);
        return "loginFrom";
    }

    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model){
        logger.info("登录名："+loginname+",密码："+password);
        for(User user:userlist){
            if(user.getLoginname().equals(loginname) && user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "welcome";
            }
        }
        return "loginFrom";
    }
}
