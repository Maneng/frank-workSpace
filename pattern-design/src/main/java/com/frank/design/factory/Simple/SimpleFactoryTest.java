package com.frank.design.factory.Simple;


public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getFactory("蒙牛"));
    }
}
