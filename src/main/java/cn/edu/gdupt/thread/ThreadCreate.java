package cn.edu.gdupt.thread;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class ThreadCreate {
    public static void main(String[] args) {
        //线程实例化
        //1.继承Thread类,创建一个线程子类(自定义的线程类)
        MyThread mt = new MyThread();
        mt.start();
        System.out.println("主线程逻辑执行结束啦");
        //2.通过实现Runnable接口,作为形参
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("线程2中的逻辑:" + i);
            }
        };
        Thread t2 = new Thread(r1);
        t2.start();
        System.out.println("主线程2中的逻辑执行结束了");
    }
}

/**
 * 这是一个自定义线程类
 * 将需要并发执行的任务写到run方法中
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程中的逻辑" + i);
        }
    }
}
