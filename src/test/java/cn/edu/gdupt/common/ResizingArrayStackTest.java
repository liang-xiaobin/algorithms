package cn.edu.gdupt.common;

import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class ResizingArrayStackTest {
    @Test
    public void testResizingArrayStack() {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        stack.push(99);
        stack.push(233);
        stack.push(122);
        stack.push(3222);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }
}
