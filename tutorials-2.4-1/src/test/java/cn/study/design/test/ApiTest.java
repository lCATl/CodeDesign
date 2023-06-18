package cn.study.design.test;

import cn.study.design.Principal;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @description: 测试
 * @author: CAT
 * @Copyright: 迪米特法则--一个类对于其他类知道的越少越好，就是说一个对象应当对其他对象有尽可能少的了解，只和朋友通行不喝陌生人说话
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Principal() {
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo("3年1班");
        logger.info("查询结果：{}", JSON.toJSONString(map));
    }

}
