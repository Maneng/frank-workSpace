package com.frank.design.factory.abstr;


import com.frank.design.factory.Simple.Milk;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中用的最广泛的模式
 * 易于扩展
 * 是一种规范，对内扩展操作，外部不用改变，直接可以用！
 */
public abstract  class AbstractFactory {


    //公公的逻辑
    //进行统一的管理

    /**
     * 获得蒙牛品牌的牛奶
     * @return
     */
    public abstract Milk getMengNiu();

    /**
     * 获得伊利的牛奶
     * @return
     */
    public abstract Milk getYiLi();

    public abstract Milk getTeLunSu();

}
