package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 10:43
 * @author:Subtimental
 * @description:TODO
 */
public class Client {
    public static void main(String[] args) {

        Adaptee adaptee=new AdapteeImpl();
        System.out.println("原来电压为:"+adaptee.maxRequest());

        Target target=new Adapter();
        String minRequest = target.minRequest();
        System.out.println("现在的电压为:"+minRequest);
    }
}
