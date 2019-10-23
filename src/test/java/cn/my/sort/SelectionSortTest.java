package cn.my.sort;

import org.junit.Test;

/**
 * my插入排序测试，时间复杂度为O(N^2),空间复杂度为O(1)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class SelectionSortTest {
    @Test
    public void testSelectionSort() {
        Integer[] k = {1, 23, 3, 43, 56, 23, 54, 87, 65, 76, 43};
        SelectionSort.sort(k);
        for (Integer i : k) {
            System.out.println(i);
        }
    }
}
