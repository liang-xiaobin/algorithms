package cn.edu.gdupt.sort;

/**
 * 归并排序算法
 * 所需时间和NlgN成正比,主要缺点是辅助数组所使用的额外空间和N的大小成正比
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class MergeSort {
    public static Comparable[] aux;

    /**
     * 将a[lo..mid] 和 a[mid+1..hi]归并
     *
     * @param a   需要排序的数组
     * @param lo  数组的开始索引
     * @param mid 数组归并的中点
     * @param hi  数组归并的终点
     */
    public static void merge(Comparable a[], int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        //将a[lo..hi]复制到aux[lo..hi]
        System.arraycopy(a, lo, aux, lo, hi - lo + 1);
        //归并回到a[lo..hi]
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (SortTemplet.less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    public static void sort(Comparable[] a) {
        //一次性分配空间
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        //将数组a[lo..hi]排序
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        //将左半边排序
        sort(a, lo, mid);
        //将右半边排序
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
}
