package cn.study.design.test;

import cn.study.design.Singleton_00;
import cn.study.design.Singleton_07;
import org.junit.Test;

import java.util.Map;

/**
 * 饿汉模式
 * 懒汉模式
 * 双重锁懒汉模式
 * 静态内部类模式
 * 枚举模式
 */
public class ApiTest {

    @Test
    public void test() {
        Singleton_07 instance = Singleton_07.INSTANCE;

    }

}
