package cn.edu.gdupt.sort;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

/**
 * 冒泡排序测试
 *
 * @author Liang Xiaobin
 * @author 1490556728@qq.com
 * @version 2019.06.01
 * @since JDK1.8
 */
public class BubbleSortTest {
    /**
     * 排序10万个随机数字花费时间为73489387938
     */
    @Test
    public void testBubbleSort() {
        int[] noSorts = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] integers = Utils.intArraytoIntegerArray(noSorts);
        long startNanoTime = System.nanoTime();
        BubbleSort.sort(integers);
        long endNanoTime = System.nanoTime();
        BubbleSort.show(integers);
        System.out.println(endNanoTime - startNanoTime);
    }
}
