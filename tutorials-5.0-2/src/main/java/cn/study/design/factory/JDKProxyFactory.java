package cn.study.design.factory;

import cn.study.design.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxyFactory {

    public static <T> T getProxy(Class<T> cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{cacheClazz}, handler);
    }

}