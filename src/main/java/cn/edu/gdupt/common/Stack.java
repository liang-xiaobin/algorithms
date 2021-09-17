package cn.edu.gdupt.common;

/**
 * 栈通过链表方式实现
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class Stack<Item> {
    private Node first;//栈顶(最近添加的元素)
    private int N;//元素数量

    private class Node {
        //定义了结点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        //向栈顶添加元素
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        //从栈顶删除元素
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
