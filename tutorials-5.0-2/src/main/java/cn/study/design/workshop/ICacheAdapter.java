package cn.study.design.workshop;

import java.util.concurrent.TimeUnit;

/**
 * @author CAT
 * @description 车间适配器
 * @Copyright CodeDesign
 */
public interface ICacheAdapter {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);


}
