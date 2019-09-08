package cn.edu.gdupt.sort;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

/**
 * 插入排序测试
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class InsertionSortTest {
    /**
     * 测试插入算法是否可用
     * 排序100000个随机数字花费时间为33080473961
     */
    @Test
    public void testInsertionSort() {
        int[] noSorts = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] noSortsInteger = Utils.intArraytoIntegerArray(noSorts);
        InsertionSort.sort(noSortsInteger);
        InsertionSort.show(noSortsInteger);
    }

    /**
     * 测试数组在有序和无序情况下插入排序花费的时间
     * 排序10万个随机数字花费时间为33080473961
     * 排序10万个已排序好的数字花费时间为2014608
     */
    @Test
    public void testDifferentTypeAaaryTime() {
        int[] noSorts = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] noSortsInteger = Utils.intArraytoIntegerArray(noSorts);
        long noSortStartTime = System.nanoTime();
        InsertionSort.sort(noSortsInteger);
        long noSortEndTime = System.nanoTime();
        long noSortTime = noSortEndTime - noSortStartTime;
        InsertionSort.show(noSortsInteger);
        System.out.println(noSortTime);
        int[] sorts = Utils.getNumberByTxt(Utils.setPath("sort"), 100000);
        Integer[] sortsInteger = Utils.intArraytoIntegerArray(sorts);
        long sortStartTime = System.nanoTime();
        InsertionSort.sort(sortsInteger);
        long sortEndTime = System.nanoTime();
        long sortTime = sortEndTime - sortStartTime;
        InsertionSort.show(sortsInteger);
        System.out.println(sortTime);
        System.out.println("无序情况下花费时间是有序的:" + noSortTime / sortTime + "倍");
    }
}
