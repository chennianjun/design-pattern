package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:05
 * @author:Subtimental
 * @description:（饿汉）
 */
public class Emperor2 {

    private static Emperor2 emperor2=new Emperor2();

    private Emperor2(){}

    public static Emperor2 getInstance(){
        return emperor2;
    }

}
