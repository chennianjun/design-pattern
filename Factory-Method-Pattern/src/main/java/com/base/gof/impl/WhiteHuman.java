package com.base.gof.impl;

import com.base.gof.Human;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:52
 * @author:Subtimental
 * @description:TODO
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("WhiteHuman.laugh");
    }
}
