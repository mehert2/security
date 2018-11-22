package sec.oauth2.oauth2sec;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Oauth2AppCtxInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	public Oauth2AppCtxInitializer() {
		super();
	}
	
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		final ConfigurableEnvironment environment = applicationContext.getEnvironment();
	       System.out.println("##$AppCtx active profile:"+environment.getActiveProfiles());
		//environment.setActiveProfiles("meaningless");
	}

}
