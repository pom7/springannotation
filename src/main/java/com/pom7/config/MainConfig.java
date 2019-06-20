package com.pom7.config;

import com.pom7.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.pom7",excludeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})} )
public class MainConfig {
    @Bean("person01")
    public Person person(){
      return   new Person("lisi",19);
    }
}
