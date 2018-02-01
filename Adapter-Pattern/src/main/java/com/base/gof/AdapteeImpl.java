package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 10:37
 * @author:Subtimental
 * @description:TODO
 */
public class AdapteeImpl implements Adaptee{
    @Override
    public String maxRequest() {
        return "220V";
    }
}
