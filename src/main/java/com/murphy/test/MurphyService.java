package com.murphy.test;

/**
 * Created by 29513 on 2017/8/4.
 */
public class MurphyService {
    @SelfAnnotation(name = "Person")
    public static Person person;
    public String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void show(){
        System.out.println(person.getName()+"---"+person.getAge());
    }
}
