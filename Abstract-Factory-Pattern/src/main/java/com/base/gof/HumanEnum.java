package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 17:37
 * @author:Subtimental
 * @description:TODO
 */
public enum HumanEnum {
    YelloMaleHuman("com.base.gof.YellowMaleHuman"),
    YelloFemaleHuman("com.base.gof.YellowFemaleHuman"),
    WhiteFemaleHuman("com.base.gof.WhiteFemaleHuman"),
    WhiteMaleHuman("com.base.gof.WhiteMaleHuman"),
    BlackFemaleHuman("com.base.gof.BlackFemaleHuman"),
    BlackMaleHuman("com.base.gof.BlackMaleHuman");
    private String value;

    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
