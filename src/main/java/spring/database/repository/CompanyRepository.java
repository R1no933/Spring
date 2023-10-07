package spring.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.database.entity.Company;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    //Optional, Entity, Future
    //@Query(name = "Company.findByName") example for name param
    @Query("select c from Company " +
            "c join fetch c.locales cl where c.name = :name")
    Optional<Company> findByName(String name);

    //Collection, Stream (batch, close)
    List<Company> findByNameContainingIgnoreCase(String fragment);
}
