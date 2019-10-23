package cn.my.sort;

import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class MergeSortTest {
    @Test
    public void testMergeSort() {
        Integer[] k = {1, 2, 5, 3, 2, 87, 45, 23, 56};
        MergeSort.sort(k);
        for (Integer i : k) {
            System.out.println(i);
        }
    }
}
