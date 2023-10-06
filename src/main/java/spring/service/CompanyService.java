package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.database.repository.CompanyRepository;
import spring.dto.CompanyReadDto;
import spring.listner.entity.AccesType;
import spring.listner.entity.EntityEvent;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final UserService userService;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public Optional<CompanyReadDto> findById(Integer id) {
        return companyRepository.findById(id)
                .map(entity -> {
                    eventPublisher.publishEvent(new EntityEvent(entity, AccesType.READ));
                    return new CompanyReadDto(entity.getId());
                });
    }
}
