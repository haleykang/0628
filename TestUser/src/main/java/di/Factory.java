package di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {
	@Bean
	public static UserService create() {
		System.out.println("2.Factory : UserService create()");
		return new UserService();
	}
}
