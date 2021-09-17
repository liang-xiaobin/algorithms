package cn.edu.gdupt.thread;

/**
 * 生产者,消费者模式
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/24
 * @since JDK1.8
 */
public class Program {
    //生产者:
    //作用是生产产品
    //生产逻辑:通过一个生产标记,判断是否需要生产产品
    //如果需要生产:生产产品,并通知消费者进行消费
    //如果不需要生产:等待

    //消费者:
    //作用是消费产品
    //消费逻辑:通过判断是否有足够的产品可以消费
    //如果可以消费:获取产品进行消费
    //如果不可以消费:等待
    public static void main(String[] args) {
        ProductPool productPool = new ProductPool(10);
        Productor productor = new Productor(productPool);
        Consumer consumer = new Consumer(productPool);
        productor.start();
        consumer.start();
    }
}
