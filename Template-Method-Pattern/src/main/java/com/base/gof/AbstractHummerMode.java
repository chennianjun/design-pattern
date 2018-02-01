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

    //java所谓的钩子函数
    protected boolean isAlarm(){
        return true;
    }

    public final void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
}
