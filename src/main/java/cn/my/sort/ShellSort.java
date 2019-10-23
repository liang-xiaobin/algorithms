package cn.my.sort;

/**
 * my希尔排序算法,时间复杂度为O(n^1.3~n^2),空间复杂度为O(1)
 * 希尔排序是基于插入排序的改进,但是希尔排序的时间复杂度不稳定,取决于排序的增量
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class ShellSort {
    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        int step = 3;
        while (h < n / step) {
            h = h * step + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j > h; j -= h) {
                    if (less(a[j], a[j - h])) {
                        exch(a, j, j - h);
                    }
                }
            }
            h = h / step;
        }
    }

    private static void exch(Comparable[] t, int a, int b) {
        Comparable temp = t[a];
        t[a] = t[b];
        t[b] = temp;
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
