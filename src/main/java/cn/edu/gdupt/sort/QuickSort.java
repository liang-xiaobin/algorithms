package cn.edu.gdupt.sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 快速排序
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class QuickSort {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    /**
     * 这个过程使得数组满足下面三个条件
     * 对于某个j,a[j]已经排定
     * a[lo]到a[j-1]中的所有元素都不大于a[j]
     * a[j+1]到a[hi]中的所有元素都不小于a[j]
     *
     * @param a  切分数组
     * @param lo 切分数组起始索引
     * @param hi 切分数组结束索引
     * @return 切分完成的元素的数组位置
     */
    private static int partition(Comparable[] a, int lo, int hi) {
        //将数组切分为a[lo..i-1],a[i],a[i+1..hi]
        //左右扫描指针
        int i = lo, j = hi + 1;
        //切分元素
        Comparable v = a[lo];
        while (true) {
            //扫描左右,检查扫描是否结束并交换元素
            while (SortTemplet.less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (SortTemplet.less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            SortTemplet.exch(a, i, j);
        }
        // 将v=a[j]放入正确的位置
        SortTemplet.exch(a, lo, j);
        // a[lo..j-1]<=a[j]<=a[j+1..hi]达成
        return j;
    }
}
