package cn.study.design.test;

import cn.study.design.LotteryResult;
import cn.study.design.LotteryService;
import cn.study.design.LotteryServiceImpl;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.doDraw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }

}
