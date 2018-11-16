
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserService {
    JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List get() {
        List<User> list = jdbcTemplate.query("SELECT * FROM test.user", new UserRowMapper());
        return list;
    }
}
