package cn.edu.gdupt.common;

import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/10/24
 * @since JDK1.8
 */
public class FixedCapacityStackTest {
    @Test
    public void testFixedCapacityStack() {
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<>(3);
        stack.push(100);
        stack.push(32);
        stack.push(21);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(99);
        stack.push(23);
        stack.push(33);
    }
}
