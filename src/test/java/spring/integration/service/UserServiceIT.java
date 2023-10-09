package spring.integration.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import spring.database.entity.enums.Role;
import spring.dto.UserCreateEditDto;
import spring.dto.UserReadDto;
import spring.integration.IntegrationTestBase;
import spring.service.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


@RequiredArgsConstructor
public class UserServiceIT extends IntegrationTestBase {

    private static final Long USER_1 = 1L;
    private static final Integer COMPANY_1 = 1;

    private final UserService userService;

    @Test
    void findAll() {
        List<UserReadDto> result = userService.findAll();
        assertThat(result).hasSize(5);
    }

    @Test
    void findById() {
        Optional<UserReadDto> maybeUser = userService.findById(USER_1);
        assertTrue(maybeUser.isPresent());
        maybeUser.ifPresent(user -> assertEquals("ivan@gmail.com", user.getUsername()));
    }

   /* @Test
    void create() {
        UserCreateEditDto userDto = new UserCreateEditDto(
                "test@gmail.com",
                LocalDate.now(),
                "Test",
                "Testovich",
                Role.USER,
                COMPANY_1
        );
        UserReadDto result = userService.create(userDto);

        assertEquals(userDto.getUsername(), result.getUsername());
        assertEquals(userDto.getBirthDate(), result.getBirthDate());
        assertEquals(userDto.getFirstname(), result.getFirstname());
        assertEquals(userDto.getLastname(), result.getLastname());
        assertSame(userDto.getRole(), result.getRole());
        assertEquals(userDto.getCompanyId(), result.getCompany().id());
    }*/

    /*@Test*/
    /*void update() {
        UserCreateEditDto userDto = new UserCreateEditDto(
                "test@gmail.com",
                LocalDate.now(),
                "Test",
                "Testovich",
                Role.USER,
                COMPANY_1
        );

        Optional<UserReadDto> actualResult = userService.update(USER_1, userDto);

        assertTrue(actualResult.isPresent());

        actualResult.ifPresent(user -> {
            assertEquals(userDto.getUsername(), user.getUsername());
            assertEquals(userDto.getBirthDate(), user.getBirthDate());
            assertEquals(userDto.getFirstname(), user.getFirstname());
            assertEquals(userDto.getLastname(), user.getLastname());
            assertSame(userDto.getRole(), user.getRole());
            assertEquals(userDto.getCompanyId(), user.getCompany().id());
        });
    }*/

    @Test
    void delete() {
        assertFalse(userService.delete(-32L));
        assertTrue(userService.delete(USER_1));
    }

}
