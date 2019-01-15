/*From the autowire-xml branch of spring-xml-demo repo create an aware-interface
branch.
Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
Movie class and print out their results.
Push the code to aware-interface branch. */

package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private ApplicationContext applicationContext;
    private Actor actor;
    //Movie constructor//
    public Movie()
    {

    }
    Movie(Actor actor){
        this.actor=actor;
    }
    //getter and setter method//
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
//    Implemented ApplicationContextAware, BeanFactoryAware, BeanNameAware in the Movie class//
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Movie movie=(Movie) beanFactory.getBean("movieXYZ");
        System.out.println("From Bean Factory"+movie.getActor().getGender());
        System.out.println("From Bean Factory"+movie.getActor().getName());
        System.out.println("From Bean Factory"+movie.getActor().getAge());
    }

    public void setBeanName(String s) {
        System.out.println("Bean name is "+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Movie movie=(Movie) applicationContext.getBean("movieXYZ");
        System.out.println("from application Context aware"+movie.getActor().getAge());
        System.out.println("from application Context aware"+movie.getActor().getName());
        System.out.println("from application Context aware"+movie.getActor().getGender());
    }
}
