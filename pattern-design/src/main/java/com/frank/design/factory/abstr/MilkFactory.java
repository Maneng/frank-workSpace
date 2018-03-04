package com.frank.design.factory.abstr;

import com.frank.design.factory.Simple.Milk;
import com.frank.design.factory.func.MengNiuFactory;
import com.frank.design.factory.func.TelunsuFactory;
import com.frank.design.factory.func.YiLiFactory;


/**
 * 内部的修改
 */
public class MilkFactory extends AbstractFactory {


    public Milk getMengNiu() {
        return new MengNiuFactory().getMilk();
    }

    public Milk getYiLi() {
        return new YiLiFactory().getMilk();
    }

    public Milk getTeLunSu() {
        return new TelunsuFactory().getMilk();
    }

    public Milk getSanLu(){
        return new SanLu();
    }
}
