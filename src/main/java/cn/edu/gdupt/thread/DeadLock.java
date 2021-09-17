package cn.edu.gdupt.thread;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class DeadLock {
    public static void main(String[] args) {
        //死锁:多个线程彼此持有对方所需要的锁对象,而不释放自己的锁
        Runnable r = () -> {
            synchronized ("A") {
                System.out.println("线程1持有A锁");
                synchronized ("B") {
                    System.out.println("线程2持有AB锁");
                }
            }
        };
        Runnable r1 = () -> {
            synchronized ("B") {
                System.out.println("线程2持有B锁");
                synchronized ("A") {
                    System.out.println("线程2持有AB锁");
                }
            }
        };
        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        t.start();
        t1.start();
    }
}
