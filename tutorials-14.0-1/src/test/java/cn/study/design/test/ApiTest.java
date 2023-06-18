package cn.study.design.test;

import cn.study.design.Activity;
import cn.study.design.ActivityController;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 享元模式：主要用于减少创建对象的数量，以减少内存占用和提高性能，
 * Create by CAT
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_queryActivityInfo() {
        Long req = 10001L;
        Activity activity = activityController.queryActivityInfo(req);
        logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
    }

}
