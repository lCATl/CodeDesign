package cn.study.design.test;

import cn.study.design.LotteryResult;
import cn.study.design.LotteryService;
import cn.study.design.LotteryServiceImpl;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CAT
 * @description
 * @Copyright CodeDesign
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_draw() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("1000000101010019");
        logger.info("Result:{}", JSON.toJSONString(result));
    }

}
