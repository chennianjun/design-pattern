package com.base.gof;

/**
 * @project:design-pattern
 * @package:PACKAGE_NAME
 * @create_date:2018/1/31 13:52
 * @author:Subtimental
 * @description:TODO
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context=new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context=new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        context=new Context(new BlockEnemy());
        context.operate();
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个-------------");
    }
}
