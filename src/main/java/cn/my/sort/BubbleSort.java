package cn.my.sort;

/**
 * my冒泡排序,时间复杂度为O(N^2),空间复杂度O(1)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class BubbleSort {
    public static void sort(Comparable[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length - 1 - i; j++) {
                if (less(t[j + 1], t[j])) {
                    exch(t, j, j + 1);
                }
            }
        }
    }

    private static Boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] t, int a, int b) {
        Comparable i = t[a];
        t[a] = t[b];
        t[b] = i;
    }
}
