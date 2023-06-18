package cn.study.design.cuisine.impl;

import cn.study.design.cook.ICook;
import cn.study.design.cuisine.ICuisine;

/**
 * @author CAT
 * @description
 * @Copyright CodeDesign
 */
public class GuangDoneCuisine implements ICuisine {

    private ICook cook;

    private GuangDoneCuisine() {
    }

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}
