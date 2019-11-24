package cn.edu.gdupt.thread;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class SynchronizedFunction {
    public static void main(String[] args) {
        //同步方法:使用关键字synchronized修改的方法是同步方法
        //实例化4个售票员,用4个线程模拟4个售票员
        Runnable r = () -> {
            while (TicketCenter.restCount > 0) {
                //对象锁:任意对象
                //类锁:
                //需要保证一点:多个线程池看到的锁，需要是同一把锁
                soldTicket();
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

    /**
     * 卖票
     * 同步方法
     * 1.静态方法 类锁 当前对象.class
     * 2.非静态方法 this
     */
    private synchronized static void soldTicket() {
        if (TicketCenter.restCount > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖出一张票,剩余" + --TicketCenter.restCount + "张");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
