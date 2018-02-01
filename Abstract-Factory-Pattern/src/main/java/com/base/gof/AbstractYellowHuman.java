package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 17:23
 * @author:Subtimental
 * @description:TODO
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("AbstractYellowHuman.laugh");
    }
}
