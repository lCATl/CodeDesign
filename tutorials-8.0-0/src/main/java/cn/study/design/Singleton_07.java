package cn.study.design;

/**
 * public abstract classEnum<E extends Enum<E>> implements Comparable<E>,Serializable
 */
public enum Singleton_07 {

    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }

}
