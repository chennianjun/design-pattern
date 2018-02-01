package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 10:40
 * @author:Subtimental
 * @description:TODO
 */
public class Adapter extends AdapteeImpl implements Target{
    @Override
    public String minRequest() {
        String maxRequest = super.maxRequest();
        maxRequest="22V";
        return maxRequest;
    }
}
