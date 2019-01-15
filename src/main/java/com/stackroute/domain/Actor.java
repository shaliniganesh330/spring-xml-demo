/*From the constructor-injection branch of spring-xml-demo repo create a
autowire-xml branch.
For the Movie bean, delete the constructor based object injection in the bean definition file
(beans.xml) that injects an Actor bean.
Use autowire byName in the Movie bean to inject an Actor bean.
Run the application.
Create another Movie bean and try autowire byType.
Run the application and note the exception thrown.
Fix the Movie bean by removing autowire byType and using constructor injection instead.
Push the code to autowire-xml branch.*/
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
