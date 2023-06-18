package cn.study.design.lang;

/**
 * @author CAT
 * @description
 * @date 2022/5/3
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright CodeDesign
 */
public interface Collection<E, T> extends Iterable {

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, T t);

    boolean removeLink(String key);

    Iterator<E> iterator();

}
