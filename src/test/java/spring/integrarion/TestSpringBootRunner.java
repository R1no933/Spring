package spring.integrarion;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.SpyBean;
import spring.database.pool.ConnectionPool;

@TestConfiguration
public class TestSpringBootRunner {

    @SpyBean(name = "pool1")
    private ConnectionPool pool1;
}
