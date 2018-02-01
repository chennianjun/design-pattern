package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 14:58
 * @author:Subtimental
 * @description:第一种（懒汉，线程不安全）
 */
public class Emperor {

    private static Emperor emperor=null;

    private Emperor(){}

    public static Emperor getInstance(){
        if (emperor==null){
            emperor=new Emperor();
        }
        return emperor;
    }

}
