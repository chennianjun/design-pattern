package com.base.gof;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/1 13:05
 * @author:Subtimental
 * @description:TODO
 */
public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        Class<People> peopleClass = People.class;
        Constructor<?>[] constructors = peopleClass.getConstructors();
        System.out.println(constructors.length);

        People people = peopleClass.newInstance();

        Method sayHello = peopleClass.getMethod("sayHello", String.class);
        sayHello.invoke(people,"123");

        Method[] methods = peopleClass.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method.getName());
        }

    }
}
