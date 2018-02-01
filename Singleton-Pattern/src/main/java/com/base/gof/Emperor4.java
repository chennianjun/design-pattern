package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:09
 * @author:Subtimental
 * @description:（静态内部类）
 */
public class Emperor4 {
    private static class SingletonHolder{
        private static final Emperor4 emperor4=new Emperor4();
    }

    private Emperor4(){}

    public static final Emperor4 getInstance(){
        return SingletonHolder.emperor4;
    }
}
