package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:03
 * @author:Subtimental
 * @description:（懒汉，线程安全）
 */
public class Emperor1 {

    private static Emperor1 emperor1=null;

    private Emperor1(){}

    public static synchronized Emperor1 getInstance(){
        if (emperor1==null){
            emperor1=new Emperor1();
        }
        return emperor1;
    }

}
