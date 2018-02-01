package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 14:47
 * @author:Subtimental
 * @description:TODO
 */
public class XiMenQing {
    public static void main(String[] args) {

        PanJinLian panJinLian=new PanJinLian();

        WangPo wangPo=new WangPo(panJinLian);

        wangPo.makeEyesWithMan();

        wangPo.happyWithMan();

        wangPo=new WangPo(new JiaShi());
        wangPo.makeEyesWithMan();

        wangPo.happyWithMan();

    }
}
