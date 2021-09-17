package cn.edu.gdupt.thread;

/**
 * 消费者
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class Consumer extends Thread {
    private ProductPool productPool;

    public Consumer(ProductPool productPool) {
        this.productPool = productPool;
    }

    @Override
    public void run() {
        while (true) {
            Product product = this.productPool.pop();
        }
    }
}
