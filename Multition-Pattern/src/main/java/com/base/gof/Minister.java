package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:42
 * @author:Subtimental
 * @description:TODO
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum =10; //10个大臣
        for(int i=0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是： ");
            emperor.emperorInfo();
        }
    }
}
