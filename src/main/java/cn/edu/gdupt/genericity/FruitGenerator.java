package cn.edu.gdupt.genericity;

/**
 * 未传入泛型实参时,与泛型类的定义相同,在声明类的时候,需要将泛型的声明也一起加到类中
 * 即: class FruitGenerator<T> implements Generator<T>
 * 如果不声明泛型,如class FruitGenerator implements Generator<T>报错
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.07
 * @since JDK1.8
 */
//public class FruitGenerator<T> implements Generator<T>{
//    @Override
//    public T next() {
//        return null;
//    }
//}

/**
 * 此实现类指定了泛型的类型
 */
public class FruitGenerator implements Generator<String> {

    @Override
    public String next() {
        return null;
    }
}
