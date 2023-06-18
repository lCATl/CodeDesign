package cn.study.design.test;

import cn.study.design.XiaoEr;
import cn.study.design.cook.impl.GuangDongCook;
import cn.study.design.cook.impl.JiangSuCook;
import cn.study.design.cook.impl.ShanDongCook;
import cn.study.design.cook.impl.SiChuanCook;
import cn.study.design.cuisine.ICuisine;
import cn.study.design.cuisine.impl.GuangDoneCuisine;
import cn.study.design.cuisine.impl.JiangSuCuisine;
import cn.study.design.cuisine.impl.ShanDongCuisine;
import cn.study.design.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_xiaoEr(){
        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        xiaoEr.placeOrder();

    }

}
