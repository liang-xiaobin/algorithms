package cn.my.sort;

import org.junit.Test;

/**
 * 冒泡排序简单测试
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        Integer[] j = {1, 32, 6, 57, 8, 9, 12, 15};
        BubbleSort.sort(j);
        for (Integer i : j) {
            System.out.println(i);
        }
    }
}
