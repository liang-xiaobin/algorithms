package cn.edu.gdupt.search;

import cn.edu.gdupt.common.Utils;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Liang Xiaobin
 * @author 1490556728@qq.com
 * @version 2019.06.01
 * @since JDK1.8
 */
public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        int[] random = Utils.getNumberByTxt(Utils.setPath("testBinarySearchResult"), 10000);
        System.out.println(random.length);
        int result = BinarySearch.rank(61432, random);
        System.out.println(result);
    }

    @Test
    public void testGenerateLargeW() {
        int[] largeW = Utils.setRandom(6, 1000000);
        Arrays.sort(largeW);
        Utils.writeNumberToTxt(Utils.setPath("sortLargeW"), largeW);
    }

    @Test
    public void testLargeTNotInLargew() {
        int[] noSortLargeTS = Utils.getNumberByTxt(Utils.setPath("noSortLargeT"), 10000);
        int[] sortLargeWS = Utils.getNumberByTxt(Utils.setPath("sortLargeW"), 1000000);
        for (int i = 0; i < noSortLargeTS.length; i++) {
            int rank = BinarySearch.rank(noSortLargeTS[i], sortLargeWS);
            int j = i + 1;
            if (rank < 0) {
                System.out.println("第" + j + "行-" + "#######" + noSortLargeTS[i]);
            }
        }
    }
}
