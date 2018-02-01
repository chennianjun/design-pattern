package com.base.gof;

import com.base.gof.impl.BlackHuman;
import com.base.gof.impl.WhiteHuman;
import com.base.gof.impl.YellowHuman;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:56
 * @author:Subtimental
 * @description:TODO
 */
public class NvWa {
    public static void main(String[] args) {
        //女娲第一次造人，试验性质，少造点，火候不足，缺陷产品
        System.out.println("------------造出的第一批人是这样的：白人-----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        //女娲第二次造人，火候加足点，然后又出了个次品，黑人
        System.out.println("------------造出的第二批人是这样的：黑人-----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        //第三批人了，这次火候掌握的正好，黄色人类（不写黄人，免得引起歧义）， 备注： RB人不属
        System.out.println("------------造出的第三批人是这样的：黄色人类-----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();

        for(int i=0;i<100000000;i++){
            System.out.println("------------随机产生人类了-----------------" +
                    i);
            Human human = HumanFactory.createHuman();
            human.laugh();
        }
    }
}
