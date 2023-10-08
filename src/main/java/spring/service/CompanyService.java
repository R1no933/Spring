package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.database.repository.CompanyRepository;
import spring.dto.CompanyReadDto;
import spring.listner.entity.AccesType;
import spring.listner.entity.EntityEvent;
import spring.mapper.CompanyReadMapper;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final ApplicationEventPublisher eventPublisher;
    private final CompanyReadMapper companyReadMapper;


    public Optional<CompanyReadDto> findById(Integer id) {
        return companyRepository.findById(id)
                .map(entity -> {
                    eventPublisher.publishEvent(new EntityEvent(entity, AccesType.READ));
                    return companyReadMapper.map(entity);
                });
    }

    public List<CompanyReadDto> findAll() {
        return companyRepository.findAll().stream()
                .map(companyReadMapper::map)
                .toList();
    }
}
