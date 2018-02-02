package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/2 13:37
 * @author:Subtimental
 * @description:TODO
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 18f;
    }
}
