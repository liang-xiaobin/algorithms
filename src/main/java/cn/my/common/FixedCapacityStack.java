package cn.my.common;

/**
 * 栈的实现固定栈的容器大小
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class FixedCapacityStack<Item> {
    //容量大小
    private int N = 0;
    //栈容器
    private Item[] a;

    //构造方法
    public FixedCapacityStack(int size) {
        a = (Item[]) new Object[size];
    }

    //入栈方法
    public void push(Item item) {
        a[N++] = item;
    }

    //出栈方法
    public Item pop() {
        return a[--N];
    }

    //获取容器当前对象数量
    public int size() {
        return N;
    }

    //判断容器是否为空
    public boolean isEmpty() {
        return N == 0;
    }
}
