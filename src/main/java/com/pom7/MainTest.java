package com.pom7;

import com.pom7.bean.Person;
import com.pom7.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Object person = classPathXmlApplicationContext.getBean("person");
//        System.out.println(person);


        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = configApplicationContext.getBean(Person.class);
        System.out.println(bean);

        //String[] names = configApplicationContext.getBeanNamesForType(Person.class);
        String[] names = configApplicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }


}
