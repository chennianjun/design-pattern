package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/2 13:35
 * @author:Subtimental
 * @description:TODO
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
