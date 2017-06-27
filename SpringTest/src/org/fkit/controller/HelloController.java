package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.mvc.Controller;
///**
// * HelloController 是一个实现Controller接口的控制器，
// * 可以处理一个单一请求。
// */
//public class HelloController implements Controller {

/**
 * 可以同时处理多个请求，并且无需实现任何接口
 */
@Controller
public class HelloController {
    private static final Log logger = LogFactory.getLog(HelloController.class);

//    /**
//     * handleRequest是Controller接口必须的实现方法
//     * 对应参数是HttpServletRequest 和 HttpServletResponse
//     * 需要返回包含视图名的ModelAndView对象
//     */
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {

@RequestMapping(value="/hello")
    public ModelAndView hello() {
        logger.info("handleRequest 被调用");
        // 创建View对象，进行返回
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello World!");
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
