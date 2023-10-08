package spring.dto;

import lombok.Value;
import lombok.experimental.FieldNameConstants;
import spring.database.entity.enums.Role;

import java.time.LocalDate;

@Value
@FieldNameConstants
public class UserCreateEditDto {
    String username;
    LocalDate birthDate;
    String firstname;
    String lastname;
    Role role;
    Integer companyId;
}
