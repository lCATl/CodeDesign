package cn.study.design.test;

import cn.study.design.QuestionBankController;
import org.junit.Test;

/**
 * 原型模式：适用于创建复杂的对象，同时又能保证性能
 * 场景：上机考试多套试卷，每人题目和答案乱序排列场景
 */

public class ApiTest {

    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }

}
