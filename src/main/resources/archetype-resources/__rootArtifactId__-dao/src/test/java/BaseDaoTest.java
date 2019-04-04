package ${package}.dao;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao-test.xml"})
public class BaseDaoTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testDB() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}