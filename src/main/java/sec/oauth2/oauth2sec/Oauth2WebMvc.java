package sec.oauth2.oauth2sec;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
@EnableWebMvc
public class Oauth2WebMvc extends WebMvcConfigurerAdapter{
	
	public Oauth2WebMvc() {
		super();
	}

}
