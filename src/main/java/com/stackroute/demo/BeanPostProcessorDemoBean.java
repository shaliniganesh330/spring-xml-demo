/*From the bean-lifecycle branch of spring-xml-demo repo create a bean-post-
processor branch.
Add a BeanPostProcessorDemoBean class in com.stackroute.demo that implements
BeanPostProcessor
Override the required methods to print out messages.
Define BeanLifecycleDemoBean as a bean in beans.xml.
Run the application and observe the result.
Push the code to bean-post-processor branch.*/
package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        Overrided the required methods to print out messages.
        System.out.println("inside postProcessBeforeInitialization"+beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("inside postProcessAfterInitialization " +beanName);
        return bean;
    }
}
