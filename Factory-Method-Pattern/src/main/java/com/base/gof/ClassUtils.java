package com.base.gof;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/1/31 16:20
 * @author:Subtimental
 * @description:TODO
 */
public class ClassUtils {

    public static List<Class> getAllClassByInterface(Class c){
        List<Class> returnClassList=new ArrayList<>();
        //如果不是一个接口，则不做处理
        if (c.isInterface()){
            String packageName = c.getPackage().getName();//获得当前的包名
            try {
                //获得当前包下以及子包下的所有类
                List<Class> classList = getClasses(packageName);
                //判断是否是同一个接口
                for (Class aClass:classList){
                    if (c.isAssignableFrom(aClass)){
                        if (!c.equals(aClass)){
                            returnClassList.add(aClass);
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return returnClassList;
    }
    //从一个包中查找出所有的类，在jar包中不能查找
    private static List<Class> getClasses(String packageName) throws IOException, ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".", "/");
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs=new ArrayList<>();
        while (resources.hasMoreElements()){
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        List<Class> classes=new ArrayList<>();
        for (File file:dirs){
            classes.addAll(findClasses(file,packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes=new ArrayList<>();
        if (!directory.exists()){
            return classes;
        }
        File[] files=directory.listFiles();
        for (File file:files){
            if (file.isDirectory()){
                assert !file.getName().contains("."):"目录不合法";
                classes.addAll(findClasses(file,packageName+"."+file.getName()));
            }else if (file.getName().endsWith(".class")){
                classes.add(Class.forName(packageName+"."+file.getName().substring(0,file.getName().length()-6)));
            }
        }
        return classes;
    }
}
