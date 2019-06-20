package com.pom7;

import com.pom7.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {

    @Test
    public void test01() {
        GetDefinitionNames();
    }

    private void GetDefinitionNames() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = configApplicationContext.getBeanDefinitionNames();
        for (String name : names
        ) {
            System.out.println(name);
        }
    }
}
