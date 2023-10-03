package spring.runners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.config.ApplicationConfiguration;
import spring.database.pool.ConnectionPool;
import spring.database.repository.CompanyRepository;
import spring.database.repository.CrudRepository;
import spring.service.CompanyService;

public class ApplicationRunner {
    public static void main(String[] args) {
        CompanyService companyService;
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(ApplicationConfiguration.class);
            context.getEnvironment().addActiveProfile("prod");
            context.refresh();
            ConnectionPool pool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(pool);

            companyService = context.getBean(CompanyService.class);
            System.out.println(companyService.findById(1));
        }

        //System.out.println(context.getBean("pool2", ConnectionPool.class));
        //System.out.println(context.getBean("pool3", ConnectionPool.class));
    }

}
