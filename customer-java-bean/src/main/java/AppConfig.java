import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration					//tells the Spring that this Java file is being used for Configuration
@ComponentScan({"com.wipro"}) 	//adding the component scan for this configuration
public class AppConfig {

// 	After we add @Service and @Repository to respective class.
// 	We don't have to define anything here.
//	That's why I commented the both methods out.
	
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		return new CustomerServiceImpl();
//	}

//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}

}
