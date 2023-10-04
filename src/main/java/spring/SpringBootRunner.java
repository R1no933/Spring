package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootRunner.class, args);
        System.out.println(context.getBeanDefinitionCount());
    }
}
