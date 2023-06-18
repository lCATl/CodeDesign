package cn.study.design;

import cn.study.design.impl.HeroHouYi;
import cn.study.design.impl.HeroLianPo;
import org.junit.Test;

/**
 * @description 单元测试
 * @author CAT
 * @Copyright CodeDesign
 */
public class ApiTest {

    @Test
    public void test_ISkill(){
        // 后裔
        HeroHouYi heroHouYi = new HeroHouYi();
        heroHouYi.doArchery();

        // 廉颇
        HeroLianPo heroLianPo = new HeroLianPo();
        heroLianPo.doInvisible();
    }

}
