package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 13:33
 * @author:Subtimental
 * @description:TODO
 */
public abstract class AbstractHummerMode {

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    public final void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
