package com.frank.design.factory.abstr;

public class AbstractFactoryTest {

    public static void main(String[] args) {



        //货比三家
        //不知道谁好谁坏
        MilkFactory factory = new MilkFactory();
        System.out.println(factory.getSanLu());
    }
}
