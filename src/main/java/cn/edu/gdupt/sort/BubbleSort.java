package cn.edu.gdupt.sort;

/**
 * 冒泡排序
 * 时间复杂度为O(n^2),空间复杂度为O(1)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class BubbleSort extends SortTemplet {
    public static void sort(Comparable[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length - 1 - i; j++) {
                if (less(t[j + 1], t[j])) {
                    exch(t, j + 1, j);
                }
            }
        }
    }
}
