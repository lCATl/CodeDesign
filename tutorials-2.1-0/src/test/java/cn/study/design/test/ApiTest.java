package cn.study.design.test;

import cn.study.design.VideoUserService;

/**
 * @description: 测试验证
 * @author: CAT
 * @Copyright: CodeDesign
 */
public class ApiTest {

    public static void main(String[] args) {
        VideoUserService service = new VideoUserService();
        service.serveGrade("VIP用户");
        service.serveGrade("普通用户");
        service.serveGrade("访客用户");
    }

}
