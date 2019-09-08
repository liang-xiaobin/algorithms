package cn.edu.gdupt.sort;

/**
 * 希尔排序
 * 已知在最坏情况下比较次数和N^(3/2)成正比,运行时间达不到平方级别
 * 大量实验证明平均每个增幅所带来的比较次数约为N^(1/5),但只有N很大时
 * 这个增幅才会变得明显.这个性质似乎也和输入模型无关
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class ShellSort extends SortTemplet {
    public static void sort(Comparable[] a) {
        int step = 3;
        //将a[]按升序排列
        int n = a.length;
        int h = 1;
        while (h < n / step) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            //将数组变为h有序
            for (int i = h; i < n; i++) {
                //将a[i]插入到a[i-h],a[i-2*h],a[i-3h]....之中
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
