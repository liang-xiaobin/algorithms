package cn.my.other.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * list集合类型测试
 * list集合可以根据索引删除，同时也可以根据存储对象删除
 * 索引必须是基本数据类型,对象必须是list中保存的对象类型
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class ListTest {
    @Test
    public void fun1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(87);
        list.remove(0);
        list.remove(new Integer(87));
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
