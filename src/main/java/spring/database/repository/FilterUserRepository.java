package spring.database.repository;

import spring.database.entity.User;
import spring.database.entity.enums.Role;
import spring.dto.PersonalInfo;
import spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);

    List<PersonalInfo> findAllByCompanyIdAndRole(Integer companyId, Role role);
}
