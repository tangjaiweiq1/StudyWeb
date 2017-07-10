package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

/**
 * Created by 64457 on 2017/7/10.
 */
@Controller
public class DataBindingController {
    private static final Log logger = LogFactory.getLog(DataBindingController.class);

    //测试@PathVarivable注解
    @RequestMapping(value="/pathVariableTest/{useId}")
    public void  pathVariableTest(@PathVariable Integer useId){
        logger.info("透过@PathVariable获取useId的值");
    }

    //测试requestHeaderTest注解
    @RequestMapping(value = "/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent,
                                  @RequestHeader(value="Accept") String[] accerpts){
        logger.info("通过@RequestHeader获得数据：" + userAgent);
        for(String act:accerpts){
            logger.info(act);
        }
    }

    // 测试@CookieValue注解
    @RequestMapping(value="/cookieValueTest")
    public void cookieValueTest(@CookieValue(value="JSESSIONID", defaultValue = "") String seesionId){
        logger.info("通过CookieValue注解来获取数据：" + seesionId);
    }
}
