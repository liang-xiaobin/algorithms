package cn.my.common;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class Queue<Item> {
    private int N; //队列中元素数量
    private Node first; //队列中最早添加进入的元素
    private Node last; //队列中最后添加进入的元素

    private class Node {
        Item item;
        Node next;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void enqueue(Item item) {
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
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }
}
