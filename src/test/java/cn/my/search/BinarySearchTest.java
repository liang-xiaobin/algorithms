package cn.my.search;

import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        int[] t = {1, 4, 5, 6, 7, 8, 9, 18};
        int rank = BinarySearch.rank(5, t);
        System.out.println(rank);

    }
}
