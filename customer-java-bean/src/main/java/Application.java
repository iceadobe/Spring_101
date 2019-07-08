import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.service.CustomerService;

public class Application {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean("customerService", CustomerService.class);
		CustomerService service2 = context.getBean("customerService", CustomerService.class);
		
//		Default scope for any bean object is singleton
//		as you can see we got two separate objects but still the hash is same.
		System.out.println(service);
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstname());
	}
}
