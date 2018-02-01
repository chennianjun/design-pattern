package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 9:10
 * @author:Subtimental
 * @description:TODO
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory humanFactory=new FemaleHumanFactory();
        System.out.println("=====第一条生产线，女性生产线=====");
        Human human = humanFactory.createYellowHuman();

        human.laugh();
        human.sex();

        HumanFactory factory=new MaleHumanFactory();
        System.out.println("=====第二条生产线，男性生产线=====");
        Human blackHuman = factory.createBlackHuman();
        blackHuman.laugh();
        blackHuman.sex();

    }
}
