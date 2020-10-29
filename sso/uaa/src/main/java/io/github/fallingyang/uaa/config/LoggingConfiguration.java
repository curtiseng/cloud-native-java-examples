package io.github.fallingyang.uaa.config;

import io.github.fallingyang.uaa.aop.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

/**
 * 1. change log level at runtime by config center or api.
 * 2. add custom fields.
 * @author yangzifeng
 */
@Configuration
@EnableAspectJAutoProxy
public class LoggingConfiguration {

    @Bean
    @Profile(Constants.SPRING_PROFILE_DEVELOPMENT)
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }

}
