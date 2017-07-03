package org.fkit.controller;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 64457 on 2017/7/3.
 */
@Controller
public class User1Controller {
    private static final Log logger = LogFactory.getLog(User1Controller.class);

    // @ModelAttribute 修饰的方法会先于login调用，该方法用于接受前台jsp页面传入的参数
    @ModelAttribute
    public void userModel(Model model){
       logger.info("userModel");
       // 创建ueser对象，存储jsp传入参数
        User user = new User();
        user.setLoginname("644574747");
        user.setPassword("q1w2e3r4t5y6");
        // 将User对象添加到Model当中
        model.addAttribute("user",user);
    }

    @RequestMapping(value="/login1")
    public String login(Model model){
        logger.info("login");
        // 从Model中取出之前存入的对象user
        User user = (User)model.asMap().get("user");
        // 设置user对象的username属性
        user.setUsername("test");
        System.out.println(user);
        return "result1";
    }
}
