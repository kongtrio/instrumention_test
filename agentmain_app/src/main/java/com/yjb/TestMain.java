package com.yjb;

/**
 * @author yangjb
 * @since 2019-03-09 15:43
 * <p>
 * 未注释
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        while (true) {
            test.print();
            Thread.sleep(1000L);
        }
    }
}
