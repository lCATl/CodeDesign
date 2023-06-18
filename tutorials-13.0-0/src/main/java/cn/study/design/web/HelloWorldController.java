package cn.study.design.web;

import cn.study.design.domain.UserInfo;
import cn.study.design.door.annotation.DoDoor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by CAT
 * 外观模式：隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 * 属于结构型模式
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    private int port;

    /**
     * @DoDoor 自定义注解
     * key：需要从入参取值的属性字段，如果是对象则从对象中取值，如果是单个值则直接使用
     * returnJson：预设拦截时返回值，是返回对象的Json
     * <p>
     * http://localhost:8080/api/queryUserInfo?userId=1001
     * http://localhost:8080/api/queryUserInfo?userId=小团团
     */
    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return new UserInfo("CAT:" + userId, 19, "宇宙太阳系地球中国");
    }

}
