package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:14
 * @author:Subtimental
 * @description:（双重校验锁）
 */
public class Emperor6 {
    private static Emperor6 emperor6=null;

    private Emperor6(){}

    public static Emperor6 getInstance(){
        if (emperor6==null){
            synchronized (Emperor6.class){
                if (emperor6==null){
                    emperor6=new Emperor6();
                }
            }
        }
        return emperor6;
    }
}
