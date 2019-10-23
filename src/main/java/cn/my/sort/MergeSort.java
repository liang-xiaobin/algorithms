package cn.my.sort;

/**
 * my归并排序,时间复杂度为O(nlogn),空间复杂度为O(n)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class MergeSort {
    private static Comparable[] aux;

    public static void sort(Comparable[] t) {
        aux = new Comparable[t.length];
        sort(t, 0, t.length - 1);
    }

    private static void sort(Comparable[] t, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(t, lo, mid);
        sort(t, mid + 1, hi);
        merge(t, lo, mid, hi);
    }

    private static void merge(Comparable[] t, int lo, int mid, int hi) {
        int j = lo;
        int k = mid + 1;
        System.arraycopy(t, lo, aux, lo, hi - lo + 1);
        for (int i = lo; i <= hi; i++) {
            if (j > mid) {
                t[i] = aux[k++];
            } else if (k > hi) {
                t[i] = aux[i++];
            } else if (less(aux[j], aux[k])) {
                t[i] = aux[j++];
            } else {
                t[i] = aux[k++];
            }
        }
    }

    private static Boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
