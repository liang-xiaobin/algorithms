package cn.my.common;

/**
 * 栈的实现动态改变数组大小
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class ResizingArrayStack<Item> {
    //容器对象数量大小
    private int N = 0;
    //容器对象
    private Item[] a = (Item[]) new Object[1];

    //数组大小改变方法
    private void resize(int size) {
        Item[] temp = (Item[]) new Object[size];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    //对象出栈
    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    //对象入栈
    public void push(Item item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    //获取当前容器对象数量
    public int size() {
        return N;
    }

    //判断容器是否为空
    public boolean isEmpty() {
        return N == 0;
    }
}
