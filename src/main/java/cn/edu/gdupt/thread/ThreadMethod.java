package cn.edu.gdupt.thread;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class ThreadMethod {
    public static void main(String[] args) {
        //线程命名
        //1.实例化一个线程对象
//        Thread t = new Thread();
//        t.setName("custom");
//        System.out.println(t.getName());
        //2.实例化一个线程对象同时，通过构造方法对线程进行命名
        //Thread(Runnable t,String name)
//        Thread t = new Thread(() -> {
//        }, "custom");
        //3.
        MyThread2 t = new MyThread2("liang");
        System.out.println(t.getName());
    }
}

class MyThread2 extends Thread {
    public MyThread2() {
    }

    public MyThread2(String name) {
        this.setName(name);
    }
}
