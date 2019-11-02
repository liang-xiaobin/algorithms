package cn.edu.gdupt.others;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/2
 * @since JDK1.8
 */
public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("foo");
        });
//        thread.run();
        thread.start();
        System.out.println("bar");
    }
}
