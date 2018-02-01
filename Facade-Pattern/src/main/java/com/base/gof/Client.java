package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 9:52
 * @author:Subtimental
 * @description:TODO
 */
public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice=new ModenPostOffice(new LetterProcessImpl());

        modenPostOffice.send("Hi 你好?","上海");
    }
}
