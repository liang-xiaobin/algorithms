package cn.edu.gdupt.genericity;

/**
 * 泛型接口练习测试
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.07
 * @since JDK1.8
 */
public interface Generator<T> {
    T next();
}
