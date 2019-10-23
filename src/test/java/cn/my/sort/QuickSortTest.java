package cn.my.sort;

import org.junit.Test;

/**
 * 快速排序算法测试
 * 时间复杂度O(logN),空间复杂度O(1)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class QuickSortTest {
    @Test
    public void testQuickSort() {
        Integer[] array = {1, 4, 2, 3, 9, 4, 5, 6, 23, 54, 43};
        QuickSort.sort(array);
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
