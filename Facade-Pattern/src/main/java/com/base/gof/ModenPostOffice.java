package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 9:50
 * @author:Subtimental
 * @description:TODO
 */
public class ModenPostOffice {

    private LetterProcess letterProcess;

    Police police=new Police();

    public ModenPostOffice(LetterProcess letterProcess) {
        this.letterProcess = letterProcess;
    }

    public void send(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelop(address);
        police.checkLetter(letterProcess);
        letterProcess.letterIntoEnvelop();
        letterProcess.sendLetter();
    }
}
