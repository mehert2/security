package sec.oauth2.oauth2sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication(exclude= {
		SecurityAutoConfiguration.class,
		ErrorMvcAutoConfiguration.class
})
@ComponentScan
@Import({
	Oauth2WebMvc.class,
	Oauth2ServletConfig.class,
	Oauth2ResServer.class
})
public class Oauth2secApplication extends SpringBootServletInitializer{
	
	public Oauth2secApplication() {
		super();
	}

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.initializers(new Oauth2AppCtxInitializer()).sources(Oauth2secApplication.class);
	}
	

	public static void main(String... args) {
		
		new SpringApplicationBuilder(Oauth2secApplication.class).
		initializers(new Oauth2AppCtxInitializer())
		.run(args);
	}
}
