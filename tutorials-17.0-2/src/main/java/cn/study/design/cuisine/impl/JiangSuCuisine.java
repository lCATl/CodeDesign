package cn.study.design.cuisine.impl;

import cn.study.design.cook.ICook;
import cn.study.design.cuisine.ICuisine;

/**
 * Create by CAT
 *
 * 江苏（苏菜）
 */
public class JiangSuCuisine implements ICuisine {

    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}