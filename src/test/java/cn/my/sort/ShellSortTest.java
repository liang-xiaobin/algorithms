package cn.my.sort;

import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class ShellSortTest {
    @Test
    public void testShellSort() {
        Integer[] k = {1, 2, 3, 23, 43, 32, 56, 234, 112};
        ShellSort.sort(k);
        for (Integer i : k) {
            System.out.println(i);
        }
    }
}
