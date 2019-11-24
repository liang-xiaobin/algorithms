package cn.edu.gdupt.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class LockDemo {
    public static void main(String[] args) {
        /**
         * 实例化一个锁对象
         */
        ReentrantLock lock = new ReentrantLock();
        //实例化4个售票员,用4个线程模拟4个售票员
        Runnable r = () -> {
            while (TicketCenter.restCount > 0) {
                //对临界资源上锁
                lock.lock();
                if (TicketCenter.restCount <= 0) {
                    lock.unlock();
                    return;
                }
                System.out.println(Thread.currentThread().getName() + ":卖出一张票,剩余" + --TicketCenter.restCount + "张");
                //对临界资源解锁
                lock.unlock();
            }
        };
        //四个线程，模拟4个售票员，用线程名字模拟售票员名字
        Thread t1 = new Thread(r, "thread-1");
        Thread t2 = new Thread(r, "thread-2");
        Thread t3 = new Thread(r, "thread-3");
        Thread t4 = new Thread(r, "thread-4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
