package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:07
 * @author:Subtimental
 * @description:（饿汉，变种）
 */
public class Emperor3 {
    private static Emperor3 emperor3=null;
    static {
        emperor3=new Emperor3();
    }

    private Emperor3(){}

    public static Emperor3 getInstance(){
        return emperor3;
    }
}
