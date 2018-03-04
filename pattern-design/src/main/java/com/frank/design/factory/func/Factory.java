package com.frank.design.factory.func;

import com.frank.design.factory.Simple.Milk;

/**
 * 工厂模型
 */
public interface Factory {

    //工厂必然有生产产品的技能
    Milk getMilk();

}
