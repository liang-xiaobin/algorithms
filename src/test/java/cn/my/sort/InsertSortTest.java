package cn.my.sort;

import org.junit.Test;

/**
 * my插入排序测试，插入排序时间复杂度为O(N^2),空间复杂度为O(1)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class InsertSortTest {
    @Test
    public void testInsertSort() {
        Integer[] array = {1, 23, 4, 34, 54, 75, 234, 56, 3455};
        InsertSort.sort(array);
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
