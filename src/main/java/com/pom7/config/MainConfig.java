package com.pom7.config;

import com.pom7.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pom7.controller")
public class MainConfig {
    @Bean("person01")
    public Person person(){
      return   new Person("lisi",18);
    }
}
