package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 13:58
 * @author:Subtimental
 * @description:TODO
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy=strategy;
    }

    public void operate() {
        strategy.operate();
    }
}
