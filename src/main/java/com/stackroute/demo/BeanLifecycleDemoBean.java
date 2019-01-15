/*rom the aware-interface branch of spring-xml-demo repo create a bean-lifecycle
branch.
Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements
InitializingBean and DisposableBean.
Override the required methods to print out messages.
Define BeanLifecycleDemoBean as a bean in beans.xml.
Run the application and observe the result.
Add two methods customInit() and customDestroy() to the BeanLifecycleDemoBean
class and print out custom messages.
In the BeanLifecycleDemoBean bean definition, in beans.xml, set the customInit()
and customDestroy() methods to be called.
Run the application.
Push the code to bean-lifecycle branch.*/
package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
//    Overrided the required methods to print out messages.//
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside after Properties Set");
    }
    public void destroy() throws Exception {
        System.out.println("inside destroy");
    }
//    methods customInit() and customDestroy() to the BeanLifecycleDemoBean class//
    public void customInit() throws Exception {
        System.out.println("inside customInit");
    }
    public void customDestroy() throws Exception {
        System.out.println("inside custom destroy");
    }
}
