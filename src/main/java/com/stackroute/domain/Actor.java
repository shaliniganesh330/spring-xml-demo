/*From the autowire-xml branch of spring-xml-demo repo create an aware-interface
branch.
Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
Movie class and print out their results.
Push the code to aware-interface branch.*/
package com.stackroute.domain;

public class Actor {
    //private members//
    private String name;
    private String gender;
    private int age;
    public Actor(){

    }
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
//getter and setter method//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
