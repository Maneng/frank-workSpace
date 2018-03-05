package com.frank;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by frank
 * Date: 2018/3/5
 * Time: 下午2:27
 */
public class JvmTest1 {

    public static void main(String[] args) {

        List<Demo> demos = new ArrayList<Demo>();
        while (true){
            demos.add(new Demo());
        }
    }
}
