package com.frank;

/**
 * Create by frank
 * Date: 2018/3/5
 * Time: 下午5:00
 */
public class Test {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        /**
         * 直接内存常量，由HashSet 来维护，无序和唯一的
         */
        System.out.println(s1 == s2);

        String s3 = new String("abc");


        System.out.println(s1 == s3);
        /**
         * 运行时常量池，放在由HashSet中 来维护，无序和唯一的
         */
        System.out.println(s1 == s3.intern());


        /**
         * result
         */
        //true
        //false
        //true


    }
}
