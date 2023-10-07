package spring.integration.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import spring.database.pool.ConnectionPool;
import spring.integration.annotation.IT;
import spring.service.UserService;

@IT
@RequiredArgsConstructor
public class UserServiceIT {

    private final UserService userService;
    private final ConnectionPool pool1;

    @Test
    @Disabled
    void test() {
        System.out.println();
    }
}
