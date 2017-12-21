package com.murphy.test;

/**
 * Created by 29513 on 2017/8/4.
 */
public class Person {
    Integer id;
    String name = "default";
    Integer age = 0;

    public Person(){
        super();
    }

    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
