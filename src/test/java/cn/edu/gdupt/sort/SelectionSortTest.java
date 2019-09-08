package cn.edu.gdupt.sort;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

/**
 * 选择排序方法测试
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class SelectionSortTest {
    /**
     * 测试选择排序是否可用
     */
    @Test
    public void testSelectionSort() {
        int[] largeTS = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] integers = Utils.intArraytoIntegerArray(largeTS);
        SelectionSort.sort(integers);
        SelectionSort.show(integers);
    }

    /**
     * 测试数组在有序和无序两种情况下花费时间
     * 排序10万个随机数字花费时间为37001324378
     * 排序10万个已排序好的数字花费时间为32140708741
     */
    @Test
    public void testDifferentTypeArrayTime() {
        int[] largeTS = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] integers = Utils.intArraytoIntegerArray(largeTS);
        long noSortStartTime = System.nanoTime();
        SelectionSort.sort(integers);
        long noSortEndTime = System.nanoTime();
        long noSortTime = noSortEndTime - noSortStartTime;
        SelectionSort.show(integers);
        System.out.println(noSortTime);
        int[] sorts = Utils.getNumberByTxt(Utils.setPath("sort"), 100000);
        Integer[] sortIntegers = Utils.intArraytoIntegerArray(sorts);
        long sortStartTime = System.nanoTime();
        SelectionSort.sort(sortIntegers);
        long sortEndTime = System.nanoTime();
        long sortTime = sortEndTime - sortStartTime;
        SelectionSort.show(sortIntegers);
        System.out.println(sortTime);
        System.out.println("有序情况下花费时间是无序的:" + sortTime / noSortTime + "倍");
    }
}
