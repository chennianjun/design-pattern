package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 17:26
 * @author:Subtimental
 * @description:TODO
 */
public class HummerH2Model extends AbstractHummerMode{
    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
