package spring.validation.impl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import spring.dto.UserCreateEditDto;
import spring.validation.UserInfo;

import static org.springframework.util.StringUtils.*;

public class UserInfoValidator implements ConstraintValidator<UserInfo, UserCreateEditDto> {
    @Override
    public boolean isValid(UserCreateEditDto value, ConstraintValidatorContext context) {
        return hasText(value.getFirstname()) || hasText(value.getLastname());
    }
}
