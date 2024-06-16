package com.example.job_seeker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class EnvConfig {

    @Value("${env.config}")
    public String ENV_CONFIG;
}
