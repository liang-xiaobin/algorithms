package cn.edu.gdupt.sort;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

/**
 * 希尔排序测试
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class ShellSortTest {
    /**
     * 排序10万个随机数字花费时间为149025595
     */
    @Test
    public void testShellSort() {
        int[] noSorts = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] integers = Utils.intArraytoIntegerArray(noSorts);
        long startTime = System.nanoTime();
        ShellSort.sort(integers);
        long endTime = System.nanoTime();
        ShellSort.show(integers);
        System.out.println(endTime - startTime);
    }
}
