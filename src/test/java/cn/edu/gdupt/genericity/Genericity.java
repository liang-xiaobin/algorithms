package cn.edu.gdupt.genericity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.07
 * @since JDK1.8
 */
public class Genericity {
    /**
     * 泛型可以放任意类型数据
     * 提取数据时需要注意数据类型
     */
    @Test
    public void testDifferent() {
        List arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add("test");
//        for (int i = 0; i < arrayList.size(); i++) {
//            String item = (String) arrayList.get(i);
//            System.out.println(item);
//        }
        int o = (int) arrayList.get(0);
        System.out.println(o);
        String s = (String) arrayList.get(1);
        System.out.println(s);
    }

    /**
     * 泛型在编译之后才会进行去泛型化处理,泛型只在编译阶段起作用,编译之后将泛型信息擦除
     * 泛型在逻辑上可以看做多个不同的类型,实际上都是相同的基本类型
     */
    @Test
    public void testSame() {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        System.out.println(integers.equals(strings));
    }

    /**
     * 泛型特性测试
     * 不能对确切的泛型类型使用instanceof操作
     */
    @Test
    public void testGeneric() {
        // 泛型的类型参数只能是类类型(包括自定义类),不能是简单类型
        // 传入的实参类型需要与泛型的类型参数类型相同,即为Integer.
        Generic<Integer> generiInterger = new Generic<>(123456);

        //传入的实参类型需要与泛型的类型参数类型相同,即为String
        Generic<String> genericString = new Generic<>("hello world");
        System.out.println(generiInterger.getKey());
        System.out.println(genericString.getKey());
    }
}
