package com.frank;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by frank
 * Date: 2018/3/5
 * Time: 下午3:27
 */
public class JconsoleTest {

    public byte[] a = new byte[128 * 1024];

    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Start...");
        fill(1000);

        
    }

    private static void fill(int i) {
        List<JconsoleTest> list = new ArrayList<JconsoleTest>();
        for (int j = 0; j < i; j++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new JconsoleTest());
        }
    }
}
