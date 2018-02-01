package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 17:31
 * @author:Subtimental
 * @description:TODO
 */
public interface HumanFactory {

    //制造黄色人类
    Human createYellowHuman();
    //制造一个白色人类
    Human createWhiteHuman();
    //制造一个黑色人类
    Human createBlackHuman();

}
