package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class main {
    public static void main(String[] args) {
        /*used XmlBeanFactory method*/
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie2=(Movie) beanFactory.getBean("movieXYZ");
        System.out.println(movie2.getActor());
        /*used  BeanDefinitionRegistry and BeanDefinitionReader method*/
        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie3=(Movie)((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movieXYZ");
        System.out.println(movie3.getActor());
        /*used ApplicationContext method */
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie4=(Movie)context.getBean("movieXYZ");
        System.out.println(movie4.getActor());
    }
}
