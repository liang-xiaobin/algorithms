package cn.edu.gdupt.others;

import org.junit.Test;

/**
 * run()方法并非是真正的多线程操作，只有run()方法执行完后才能继续执行后面方法
 * 调用start()后，线程会被放到等待队列，等待cpu调度，并不一定要马上开始执行，只是将这个线程
 * 置于可动行状态。然后通过JVM，线程Thread会调用run(),执行本线程的线程体。
 * 1.start()来启动线程，真正实现了多线程运行。这是无需等待run方法体代码执行完毕，可以直接继续执行下面
 * 代码。
 * 2.run()方法当做普通方法的方式调用。程序还是要顺序执行，要等待run方法体执行完毕后，才可以继续执行下面
 * 的代码，这样就没有达到写线程的目的
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/2
 * @since JDK1.8
 */
public class TheadTest {
    @Test
    public void fun1() {
        Thread thread = new Thread(() -> {
            System.out.println("foo");
        });
        thread.run();
        System.out.println("bar");
    }

    @Test
    public void fun2() {
        Thread thread = new Thread(() -> {
            System.out.println("foo");
        });
        thread.start();
        System.out.println("bar");
    }
}
