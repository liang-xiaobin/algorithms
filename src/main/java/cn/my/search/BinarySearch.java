package cn.my.search;

/**
 * my二分法查找算法测试
 * 二分法查找的时间复杂度为O(logn),空间复杂度为O(1)
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/23
 * @since JDK1.8
 */
public class BinarySearch {
    /**
     * 二分法查找前提数组必须有序
     *
     * @param key
     * @param t
     */
    public static int rank(int key, int t[]) {
        int lo = 0;
        int hi = t.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key > t[mid]) {
                lo = mid + 1;
            } else if (key < t[mid]) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
