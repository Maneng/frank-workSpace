package com.frank.design.factory.func;

import com.frank.design.factory.Simple.MengNiu;
import com.frank.design.factory.Simple.Milk;

public class MengNiuFactory implements Factory {


    public Milk getMilk() {
        return new MengNiu();
    }
}
