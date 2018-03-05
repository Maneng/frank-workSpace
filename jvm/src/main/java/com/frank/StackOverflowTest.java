package com.frank;

/**
 * Create by frank
 * Date: 2018/3/5
 * Time: 下午4:26
 */
public class StackOverflowTest {


    /**
     * 栈溢出
     */
    private void  get() {
        System.out.println("get");
        get();
    }

    public static void main(String[] args) {
        new StackOverflowTest().get();
    }
}
