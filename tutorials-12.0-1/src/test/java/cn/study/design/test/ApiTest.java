package cn.study.design.test;

import cn.study.design.LoginSsoDecorator;
import org.junit.Test;

/**
 * 装饰器模式：在不改变现有对象结构的情况下，动态第给搞对象增加一些职责（即增加额外功能）的模式，他属于对象结构模式
 */

public class ApiTest {

    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }

}
