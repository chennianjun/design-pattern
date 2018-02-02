package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/2 13:36
 * @author:Subtimental
 * @description:TODO
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
