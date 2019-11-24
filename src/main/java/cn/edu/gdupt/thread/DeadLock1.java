package cn.edu.gdupt.thread;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class DeadLock1 {
    public static void main(String[] args) {
        //死锁:多个线程彼此持有对方所需要的锁对象,而不释放自己的锁
        //wait:等待,是Object类中的一个方法，当前线程释放自己的锁标记，并且
        //让出CPU资源,使得当前线程进入等待队列中
        //notify:通知，是Object类中的一个方法,唤醒某个锁标记等待队列中的一个线程,使得这个线程进入锁池
        //notifyAll:通知,是Object类中的一个方法,唤醒某个锁标记等待队列中所有的线程,并使这些线程进入锁池
        Runnable r = () -> {
            synchronized ("A") {
                System.out.println("线程1持有A锁");
                //释放已经持有的A锁标记,并进入等待队列
                try {
                    "A".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized ("B") {
                    System.out.println("线程1持有AB锁");
                }
            }
        };
        Runnable r1 = () -> {
            synchronized ("B") {
                System.out.println("线程2持有B锁");
                synchronized ("A") {
                    System.out.println("线程2持有AB锁");
                    "A".notify();
                }
            }
        };
        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        t.start();
        t1.start();
    }
}
