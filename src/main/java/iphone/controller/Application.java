package iphone.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//通过@Configuration+@ComponentScan开启注解扫描并自动注册相应的注解Bean.
@Configuration
@ComponentScan(basePackages="iphone")
@EnableAutoConfiguration
@EntityScan(basePackages= "iphone.dataobject")
@EnableJpaRepositories(basePackages= "iphone.repository")
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
    }
}
