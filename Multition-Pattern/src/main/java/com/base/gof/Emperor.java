package com.base.gof;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:28
 * @author:Subtimental
 * @description:TODO
 */
public class Emperor {

    private static int maxEmperorNum=3;

    private static List<String> emperorNameList=new ArrayList<>(maxEmperorNum);

    private static List<Emperor> emperorList=new ArrayList<>();

    private static int countNumOfEmperor;

    static {
        for (int i=0;i<maxEmperorNum;i++){
            emperorList.add(new Emperor("我是第"+(i+1)+"个皇帝"));
        }
    }

    private Emperor() {
    }

    private Emperor(String name) {
        emperorNameList.add(name);
    }

    public static Emperor getInstance(){
        Random random=new Random();
        countNumOfEmperor = random.nextInt(maxEmperorNum);
        return emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo(){
        System.out.println(emperorNameList.get(countNumOfEmperor));
    }

}
