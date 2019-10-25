package cn.my.other.test;

import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/25
 * @since JDK1.8
 */
public class CommonTest {
    @Test
    public void fun1() {
        int a = 100, b = 50, c = a-- - b, d = a-- - b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
