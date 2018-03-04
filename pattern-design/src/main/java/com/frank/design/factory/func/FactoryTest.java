package com.frank.design.factory.func;

import com.frank.design.factory.Simple.Milk;

public class FactoryTest {

    public static void main(String[] args) {

        MengNiuFactory factory = new MengNiuFactory();
        System.out.println(factory.getMilk());
    }
}
