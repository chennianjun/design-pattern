package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/2 13:38
 * @author:Subtimental
 * @description:TODO
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.4f;
    }
}
