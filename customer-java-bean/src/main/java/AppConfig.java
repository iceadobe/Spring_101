import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({ "com.wipro" })
@PropertySource("app.properties")
public class AppConfig {

	// To Load the content of app.properties it is mandatory that a static
	// method like this be imported in the place
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
