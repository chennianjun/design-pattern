package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 9:46
 * @author:Subtimental
 * @description:TODO
 */
public class LetterProcessImpl implements LetterProcess{
    @Override
    public void writeContext(String context) {
        System.out.println("写信:"+context);
    }

    @Override
    public void fillEnvelop(String address) {
        System.out.println("写信封地址:"+address);
    }

    @Override
    public void letterIntoEnvelop() {
        System.out.println("把信装进信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("发送信件");
    }
}
