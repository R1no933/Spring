package spring.runners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.config.ApplicationConfiguration;
import spring.database.pool.ConnectionPool;
import spring.database.repository.CompanyRepository;
import spring.database.repository.CrudRepository;

public class ApplicationRunner {
    public static void main(String[] args) {
        CrudRepository companyRepository;
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(ApplicationConfiguration.class);
            context.getEnvironment().addActiveProfile("prod");
            context.refresh();
            ConnectionPool pool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(pool);

            companyRepository = context.getBean("companyRepository", CrudRepository.class);
            System.out.println(companyRepository.findById(1));
        }

        //System.out.println(context.getBean("pool2", ConnectionPool.class));
        //System.out.println(context.getBean("pool3", ConnectionPool.class));
    }

}
