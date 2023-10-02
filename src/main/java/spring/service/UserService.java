package spring.service;

import org.springframework.stereotype.Service;
import spring.database.entity.Company;
import spring.database.repository.CompanyRepository;
import spring.database.repository.CrudRepository;
import spring.database.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
