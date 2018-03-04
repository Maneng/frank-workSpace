package com.frank.design.factory.Simple;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public  Milk getFactory(String name) {

        if ("特伦苏".equals(name)) {
            return new TeLunSu();
        } else if ("蒙牛".equals(name)) {
            return new MengNiu();
        }else if ("伊利".equals(name)){
            return new YiLi();
        }

        return null;
    }
}
