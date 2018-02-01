package com.base.gof;

import java.util.List;
import java.util.Random;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 15:52
 * @author:Subtimental
 * @description:TODO
 */
public class HumanFactory {

    public static Human createHuman(Class c){
        Human human=null;
        try {
            human= (Human) Class.forName(c.getName()).newInstance();
        }catch (InstantiationException e) {//你要是不说个人类颜色的话，没法烤，要白的黑，你说话了才好烤
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) { //定义的人类有问题，那就烤不出来了，这是...
            System.out.println("人类定义错误！ ");
        } catch (ClassNotFoundException e) { //你随便说个人类，我到哪里给你制造去？！
            System.out.println("混蛋，你指定的人类找不到！ ");
        }
        return human;
    }

    public static Human createHuman(){
        List<Class> allClassByInterface = ClassUtils.getAllClassByInterface(Human.class);
        Random random=new Random();
        int rand = random.nextInt(allClassByInterface.size());
        Human human = createHuman(allClassByInterface.get(rand));
        return human;
    }

}
