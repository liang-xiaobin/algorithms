package cn.edu.gdupt.sort;

/**
 * 插入排序
 * 时间复杂度为O(n^2),空间复杂度为O(1)
 * 对于随机排列的长度为N且主键不重复的数组，平均情况下插入排序需要~N^2/4次比较和~N^2/4次交换;最坏情况下
 * 需要~N^2/2次比较和~N^2/2次交换;最好情况下需要N-1次比较和0次交换
 *
 * @author Liang Xiaobin
 * @author 1490556728@qq.com
 * @version 2019.06.01
 * @since JDK1.8
 */
public class InsertionSort extends SortTemplet {
    public static void sort(Comparable[] a) {
        //将a[]按照升序排列
        int N = a.length;
        for (int i = 1; i < N; i++) {
            //将a[i]插入到a[i-1]、a[i-2]、a[i-3]....之中
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
