package cn.study.design.workshop.impl;

import cn.study.design.redis.cluster.IIR;
import cn.study.design.workshop.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author CAT
 * @description
 * @Copyright CodeDesign
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }

}
