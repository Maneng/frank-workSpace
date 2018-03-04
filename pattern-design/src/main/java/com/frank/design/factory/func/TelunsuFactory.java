package com.frank.design.factory.func;

import com.frank.design.factory.Simple.Milk;
import com.frank.design.factory.Simple.TeLunSu;

public class TelunsuFactory implements Factory {


    public Milk getMilk() {
        return new TeLunSu();
    }
}
