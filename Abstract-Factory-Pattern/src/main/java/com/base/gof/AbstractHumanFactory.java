package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 17:38
 * @author:Subtimental
 * @description:TODO
 */
public abstract class AbstractHumanFactory implements HumanFactory{

    protected Human createHuman(HumanEnum humanEnum){
        Human human = null;
        if (humanEnum.getValue()!=null){
            try {
                //直接产生一个实例
                human= (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }

}
