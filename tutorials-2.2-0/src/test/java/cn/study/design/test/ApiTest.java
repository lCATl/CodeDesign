package cn.study.design.test;

import cn.study.design.ICalculationArea;
import cn.study.design.impl.CalculationAreaExt;
import org.junit.Test;

/**
 * @description: 功能测试
 * @author: CAT
 * @Copyright: CodeDesign
 */
public class ApiTest {

    @Test
    public void test_CalculationAreaExt(){
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }

}
