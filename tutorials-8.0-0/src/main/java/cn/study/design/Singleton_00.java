package cn.study.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * static jvm初始化过程中实例化
 */
public class Singleton_00 {

    public static Map<String, String> cache = new ConcurrentHashMap<String, String>();

}
