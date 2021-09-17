package cn.edu.gdupt.sort;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class MergeBU {
    /**
     * 归并所需的辅助数组
     */

    public static void sort(Comparable[] a) {
        // 进行lgN次两两归并
        int N = a.length;
        MergeSort.aux = new Comparable[N];
        //sz子数组大小
        for (int sz = 1; sz < N; sz = sz + sz) {
            //lo:子数组索引
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                MergeSort.merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }
}
