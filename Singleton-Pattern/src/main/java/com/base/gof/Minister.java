package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:17
 * @author:Subtimental
 * @description:TODO
 */
public class Minister {
    public static void main(String[] args) {
        //第一天
        Emperor emperor1 = Emperor.getInstance();
        System.out.println(emperor1.getClass());
        //第一天见的皇帝叫什么名字呢？
        //第二天
        Emperor emperor2 = Emperor.getInstance();
        System.out.println(emperor2.getClass());
        //第三天
        Emperor emperor3 = Emperor.getInstance();
        System.out.println(emperor3.getClass());
        //三天见的皇帝都是同一个人，荣幸吧！
    }
}
