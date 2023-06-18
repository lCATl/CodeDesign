package cn.study.design.test;

import cn.study.design.application.CacheService;
import cn.study.design.factory.JDKProxyFactory;
import cn.study.design.workshop.impl.EGMCacheAdapter;
import cn.study.design.workshop.impl.IIRCacheAdapter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CAT
 * @description 单元测试
 * @Copyright CodeDesign
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EGM.set("user_name_01", "CAT");
        String val01 = proxy_EGM.get("user_name_01");
        logger.info("缓存服务 EGM 测试，proxy_EGM.get 测试结果：{}", val01);

        CacheService proxy_IIR = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_IIR.set("user_name_01", "CAT");
        String val02 = proxy_IIR.get("user_name_01");
        logger.info("缓存服务 IIR 测试，proxy_IIR.get 测试结果：{}", val02);
    }

}

