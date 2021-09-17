package cn.edu.gdupt.sort;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class MergeBUTest {
    @Test
    public void testMergeBUTest() {
        int[] noSorts = Utils.getNumberByTxt(Utils.setPath("noSort"), 100000);
        Integer[] integers = Utils.intArraytoIntegerArray(noSorts);
        SortTemplet.show(integers);
        long stratTime = System.nanoTime();
        MergeBU.sort(integers);
        long endTime = System.nanoTime();
        SortTemplet.show(integers);
        System.out.println(endTime - stratTime);
    }
}
