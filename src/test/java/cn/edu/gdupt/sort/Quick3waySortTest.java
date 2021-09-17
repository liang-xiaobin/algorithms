package cn.edu.gdupt.sort;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.10
 * @since JDK1.8
 */
public class Quick3waySortTest {
    @Test
    public void testQuick3waySort() {
        int[] quick3ways = Utils.getNumberByTxt(Utils.setPath("quick3way"), 10);
        Integer[] integers = Utils.intArraytoIntegerArray(quick3ways);
        long startTime = System.nanoTime();
        Quick3way.sort(integers);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        SortTemplet.show(integers);
    }
}
