package cn.edu.gdupt.sort;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

/**
 * 归并排序测试
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class mergeSortTest {
    /**
     * 采用自顶向下的归并排序算法排序100000个无序整数,花费时长为150639720
     */
    @Test
    public void testMergeSort() {
        int[] noSorts = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] integers = Utils.intArraytoIntegerArray(noSorts);
        SortTemplet.show(integers);
        long startTime = System.nanoTime();
        MergeSort.sort(integers);
        long endTime = System.nanoTime();
        SortTemplet.show(integers);
        System.out.println(endTime - startTime);
    }
}
