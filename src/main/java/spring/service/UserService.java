package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.database.entity.Company;
import spring.database.repository.CompanyRepository;
import spring.database.repository.CrudRepository;
import spring.database.repository.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;
}
