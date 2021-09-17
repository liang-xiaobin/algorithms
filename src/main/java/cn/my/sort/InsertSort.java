package cn.my.sort;

/**
 * my插入排序时间复杂度为O(N^2),空间复杂度为O(1)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class InsertSort {
    public static void sort(Comparable[] t) {
        for (int i = 1; i < t.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (less(t[j], t[j - 1])) {
                    exch(t, j, j - 1);
                }
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] t, int i, int j) {
        Comparable temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }
}
