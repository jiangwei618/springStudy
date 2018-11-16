package MvcTest.config;

import MvcTest.Interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"MvcTest.Interceptor", "MvcTest.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {
    @Autowired
    MyInterceptor myInterceptor;

    @Autowired
    InternalResourceViewResolver internalResourceViewResolver;

    @Bean(name = "viewResolver")
    public InternalResourceViewResolver gerInternalResourceViewResolver() {
        return new InternalResourceViewResolver("WEB-INF/jsp/", ".jsp");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(myInterceptor).addPathPatterns("**.*");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        super.configureViewResolvers(registry);
        registry.viewResolver(internalResourceViewResolver);
    }



}
