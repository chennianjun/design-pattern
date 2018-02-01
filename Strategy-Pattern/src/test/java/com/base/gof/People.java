package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 13:03
 * @author:Subtimental
 * @description:TODO
 */
public class People {
    private String id;

    public People(String id) {
        this.id = id;
    }

    public People() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void sayHello(String id){
        System.out.println("id = [" + id + "]");
    }

}
