import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.service.CustomerService;

public class Application {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
	}
}
