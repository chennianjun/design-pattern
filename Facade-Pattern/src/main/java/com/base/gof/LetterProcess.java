package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 9:44
 * @author:Subtimental
 * @description:TODO
 */
public interface LetterProcess {

    void writeContext(String context);

    void fillEnvelop(String address);

    void letterIntoEnvelop();

    void sendLetter();

}
