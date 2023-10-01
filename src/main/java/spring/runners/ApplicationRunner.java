package spring.runners;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.database.pool.ConnectionPool;
import spring.database.repository.CompanyRepository;

public class ApplicationRunner {
    public static void main(String[] args) {
        CompanyRepository companyRepository;
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml")) {
            ConnectionPool pool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(pool);

            companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);
        }

        //System.out.println(context.getBean("pool2", ConnectionPool.class));
        //System.out.println(context.getBean("pool3", ConnectionPool.class));
    }

}
