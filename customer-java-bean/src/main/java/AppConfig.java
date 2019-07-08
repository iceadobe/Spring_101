import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.repository.CustomerRepository;
import com.wipro.repository.HibernateCustomerRepositoryImpl;
import com.wipro.service.CustomerService;
import com.wipro.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl(getCustomerRepository());
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
