package cn.edu.gdupt.genericity;

/**
 * 泛型特性练习
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.07
 * @since JDK1.8
 */
public class Generic<T> {
    private T key;

    /**
     * 泛型构造方法形参key类型也为T,T的类型由外部指定
     *
     * @param key
     */
    public Generic(T key) {
        this.key = key;
    }

    /**
     * get方法返回值也为T,T的类型由外部指定
     *
     * @return key
     */
    public T getKey() {
        return key;
    }
}
