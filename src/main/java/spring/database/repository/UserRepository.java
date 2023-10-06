package spring.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.database.entity.User;
import spring.database.pool.ConnectionPool;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User " +
            "u where u.firstname like %:firstname% and u.lastname like %:lastname%")
    List<User> findAllBy(String firstname, String lastname);

    @Query(value = "select * from users u where u.username = :username",
            nativeQuery = true)
    List<User> findAllByUsername(String username);
}
