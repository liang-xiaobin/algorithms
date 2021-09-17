package cn.edu.gdupt.common;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class Queue<Item> {
    private Node first; //指向最早添加的结点的链接
    private Node last; //指向最近添加的结点的链接
    private int N; //队列中元素数量

    private class Node {
        //定义了结点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty() {
//        return N == 0;
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        //向表尾添加元素
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }

    public Item dequeue() {
        //从表头删除元素
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }
}
