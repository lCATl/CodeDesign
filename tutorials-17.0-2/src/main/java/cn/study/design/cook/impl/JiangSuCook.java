package cn.study.design.cook.impl;

import cn.study.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create by CAT
 */
public class JiangSuCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    public void doCooking() {
        logger.info("江苏厨师，烹饪苏菜，宫廷菜系，古今国宴上最受人欢迎的菜系。");
    }

}
