package com.murphy.test;


import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by 29513 on 2017/8/4.
 */
public class Test2 {

    // 把一个字符串的第一个字母大写、效率是最高的、
    private static String getMethodName(String fildeName) throws Exception{
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }

    public static void main(String[] arg) throws Exception {
        Class<MurphyService> murphyServiceClass = MurphyService.class;
        Field[] fields = murphyServiceClass.getDeclaredFields();
        System.out.println(fields.length);
        for (Field field : fields) {
            System.out.println("类型"+field.getGenericType());


            Annotation[] annotations = field.getDeclaredAnnotations();
            System.out.println(annotations.length);
            for (Annotation annotation : annotations){
                if(annotation.annotationType() == SelfAnnotation.class){
                    System.out.println("YES");
                    String beanName = ((SelfAnnotation)annotation).name();
                    Class<?> cc = Class.forName("com.murphy.test."+beanName);
                    Object ob = cc.newInstance();
                    System.out.println("12"+field.getName()+"===="+beanName);
                    field.set(null,ob);
                    Method method = murphyServiceClass.getDeclaredMethod("show");
                    method.invoke(murphyServiceClass.newInstance());

                    Class<?> c2 = Class.forName("com.murphy.test."+beanName);
                    Class<?>[] types = new Class[]{String.class,Integer.class};
                    Constructor<?> ctor = c2.getConstructor(types);
                    Object[] obj = new Object[]{"yang",25};
                    Object object = ctor.newInstance(obj);
                    field.set(null,object);
                    Method method2 = murphyServiceClass.getDeclaredMethod("show");
                    method2.invoke(murphyServiceClass.newInstance());
                }
            }
        }

        MurphyService murphyService = new MurphyService();
        System.out.println(murphyService.person.getName()+murphyService.person.getAge());
    }

}
