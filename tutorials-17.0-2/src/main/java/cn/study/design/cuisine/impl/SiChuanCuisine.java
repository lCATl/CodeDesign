package cn.study.design.cuisine.impl;


import cn.study.design.cook.ICook;
import cn.study.design.cuisine.ICuisine;

/**
 * Create by CAT
 *
 * 四川（川菜）
 */
public class SiChuanCuisine implements ICuisine {

    private ICook cook;

    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}