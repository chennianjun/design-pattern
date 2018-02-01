package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 17:28
 * @author:Subtimental
 * @description:TODO
 */
public class Client {
    public static void main(String[] args) {
        AbstractHummerMode abstractHummerMode=new HummerH2Model();
        abstractHummerMode.run();

        HummerH1Model hummerMode=new HummerH1Model();
        hummerMode.setAlarmFlag(true);
        hummerMode.run();
    }
}
