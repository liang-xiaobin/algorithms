package cn.edu.gdupt.sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 三向切分快速的快速排序
 * 对于存在大量重复元素的数组,这种方法比标准的快速排序的效率高很多
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.10
 * @since JDK1.8
 */
public class Quick3way {
    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                SortTemplet.exch(a, lt++, i++);
            } else if (cmp > 0) {
                SortTemplet.exch(a, i, gt--);
            } else {
                i++;
            }
        }
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }
}
