package com.frank.design.factory.func;

import com.frank.design.factory.Simple.Milk;
import com.frank.design.factory.Simple.YiLi;

public class YiLiFactory implements  Factory {

    public Milk getMilk() {
        return new YiLi();
    }
}
