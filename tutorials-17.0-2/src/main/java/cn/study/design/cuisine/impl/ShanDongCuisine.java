package cn.study.design.cuisine.impl;

import cn.study.design.cook.ICook;
import cn.study.design.cuisine.ICuisine;

/**
 * Create by CAT
 *
 * 山东（鲁菜）
 */
public class ShanDongCuisine implements ICuisine {

    private ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}