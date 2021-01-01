package com.ahy231.springboot06datajdbc.config;

import com.ahy231.springboot06datajdbc.bean.Dog;
import com.ahy231.springboot06datajdbc.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MyAppConfig {

    //将方法返回值添加到容器中
    @Bean("getPerson")
    public Person person() {
        Person person = new Person();
        person.setDog(dog());
        return person;
    }

    @Bean("getDog")
    public Dog dog() {
        return new Dog();
    }
}
