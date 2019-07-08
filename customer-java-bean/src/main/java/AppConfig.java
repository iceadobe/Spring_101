import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.service.CustomerService;
import com.wipro.service.CustomerServiceImpl;

@Configuration					//tells the Spring that this Java file is being used for Configuration
@ComponentScan({"com.wipro"}) 	//adding the component scan for this configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}

}
