package cn.study.design.cook.impl;

import cn.study.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CAT
 * @description
 * @Copyright CodeDesign
 */
public class GuangDongCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("广东厨师，烹饪鲁菜，宫廷菜系，以孔府风味为龙头");
    }

}
