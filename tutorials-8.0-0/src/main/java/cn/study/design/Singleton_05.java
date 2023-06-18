package cn.study.design;

/**
 * 双重锁校验
 */
public class Singleton_05 {

    /**
     * 单例模式在JVM执行过程中分三步
     * 1、开辟内存空间
     * 2、实例化参数
     * 3、对象指向堆内存空间
     * 但存在指令重排的优化，在2和3两个步骤切换线程的时候先执行了指向操作，这个时候处于临界点，对象还未初始化，DCL失效  所以要添加volatile关键字
     */
    private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance(){

       if(null != instance) return instance;
       //DCL处理
       synchronized (Singleton_05.class){
           if (null == instance){
               instance = new Singleton_05();
           }
       }
       return instance;
    }

}
