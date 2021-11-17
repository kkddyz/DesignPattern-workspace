package headfirst_design_pattern.IteratorPattern.Iterator;

/**
 * @author kkddyz
 * @date 2021/11/17
 * @description 定义迭代器接口
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}
