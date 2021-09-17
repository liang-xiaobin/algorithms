package cn.edu.gdupt.thread;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class MethodCreate1 {
    public static void main(String[] args) {
        //threadSleep();
        //threadPriority();
        threadYield();
    }

    /**
     * 线程礼让
     */
    private static void threadYield() {
        //线程礼让，指的是让当前运行状态的线程释放自己的CPU资源，由运行状态，回到就绪状态
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    if (i == 3) {
                        Thread.yield();
                    }
                }
            }
        };
        Thread thread1 = new Thread(r, "thread-1");
        Thread thread2 = new Thread(r, "thread-2");
        thread1.start();
        thread2.start();
    }

    /**
     * 设置线程的优先级
     */
    private static void threadPriority() {
        //设置线程的优先级，只是修改这个线程可以去抢到CPU时间片的概率
        //并不是优先级高的线程一定能抢到CPU时间片
        //优先级的设置，是一个整数[0,10]的整数,默认是5
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(r, "Thread1");
        Thread t2 = new Thread(r, "Thread2");
        //设置线程的优先级
        //设置优先级必须要放到这个线程开始执行(start)之前
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }

    private static void threadSleep() {
        //1.实例化一个线程对象
        MyThread3 thread3 = new MyThread3();
        thread3.start();
    }

    /**
     * 线程命名
     */
    private static void threadName() {

    }
}

class MyThread3 extends Thread {
    public MyThread3() {

    }

    public MyThread3(String name) {
        this.setName("liang");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            //线程休眠
            //1.参数:毫秒为单位的时间差
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
