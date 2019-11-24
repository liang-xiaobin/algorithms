package cn.edu.gdupt.thread;

/**
 * 生产者
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class Productor extends Thread {
    private ProductPool productPool;

    public Productor(ProductPool productPool) {
        this.productPool = productPool;
    }

    @Override
    public void run() {
        while (true) {
            Product product = new Product((int)(Math.random() * 100) + "产品");
            productPool.push(product);
        }
    }
}
