package sec.oauth2.oauth2sec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class Oauth2ServletConfig {
	
	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}
	
	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
        final ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(), "/*");

        final Map<String, String> params = new HashMap<String, String>();
        params.put("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
        params.put("contextConfigLocation", "org.spring.sec2.spring");
        params.put("dispatchOptionsRequest", "true");
        registration.setInitParameters(params);

        registration.setLoadOnStartup(1);
        return registration;
	}
	

//    @Bean
//    @Order(1)
//    public FilterRegistrationBean springSecurityFilterChain() {
//        final FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
//        final DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
//        filterRegBean.setFilter(delegatingFilterProxy);
//        final List<String> urlPatterns = new ArrayList<String>();
//        urlPatterns.add("/*");
//        filterRegBean.setUrlPatterns(urlPatterns);
//        return filterRegBean;
//    }

}
