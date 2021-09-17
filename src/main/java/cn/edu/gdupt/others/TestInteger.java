package cn.edu.gdupt.others;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/10
 * @since JDK1.8
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer i = 100;
        Integer j = 100;
        System.out.println(i == j);
        Integer m = new Integer(99);
        Integer n = new Integer(99);
        System.out.println(m == n);
    }
}
