/*Add constructor to the Actor class to initialize with name and gender, and age
Create three beans of type Actor in the bean definition file.
Use constructor-based injection in the bean definition file (beans.xml) to inject property values in
each of the three beans via name, index, and type respectively.
For the Movie bean, use constructor based object injection in the bean definition file
(beans.xml) to inject an Actor bean.
In the Main class, look up Movie bean using ApplicationContext and print out Author
information.
Use the same ApplicationContext to again look up the same Movie bean.
Print out the equality result of the two Movie beans.
System.out.println(beanA==beanB);
Change the scope of the Movie bean in beans.xml to prototype and run the application again.
Replace id of the Movie bean with name having two values, like this:<bean name=”MovieA, MovieB” ........>
Update the code in Main to get the Movie bean by its two different name.
Push the code to constructor-injection branch.*/
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
