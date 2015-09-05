package pooler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asa.pooler.PoolerServicesApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PoolerServicesApplication.class)
@WebAppConfiguration
public class PoolerServicesApplicationTests {

	@Test
	public void contextLoads() {
	}

}
