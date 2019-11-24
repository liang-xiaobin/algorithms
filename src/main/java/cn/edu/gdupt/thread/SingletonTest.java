package cn.edu.gdupt.thread;

/**
 * 单例模式下的懒汉模式问题
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class SingletonTest {
    public static void main(String[] args) {
        Runnable runnable = Boss::getBoss;
        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
        }
    }
}

class Boss {
    private Boss() {
        System.out.println("一个Boss对象被实例化了");
    }

    private static Boss Instance = null;

    //    public static Boss getBoss() {
//        synchronized ("") {
//            if (Instance == null) {
//                Instance = new Boss();
//            }
//        }
//        return Instance;
//    }
    public static synchronized Boss getBoss() {
        if (Instance == null) {
            Instance = new Boss();
        }
        return Instance;
    }
}