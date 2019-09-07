package cn.edu.gdupt.sort;

/**
 * 选择排序实现
 * 选择排序特点：①运行时间和输入无关 ②数据移动是最少的
 * 对于长度为N的数组,选择排序需要大约N^2/2次比较和N次交换
 * (N-1)+(N-2)+....+2+1 = N(N-1)/2~ N^2/2次比较
 * @author Liang Xiaobin
 * @author 1490556728@qq.com
 * @version 2019.06.01
 * @since JDK1.8
 */
public class SelectionSort extends SortTemplet {
    public static void sort(Comparable[] a) {
        //将a[]按升序排列
        int N = a.length;
        for (int i = 0; i < N; i++) {
            //将a[i]和a[i+1>>N]中最小的元素交换
            //最小元素索引
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
