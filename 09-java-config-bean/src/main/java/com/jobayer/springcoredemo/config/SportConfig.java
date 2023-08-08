package com.jobayer.springcoredemo.config;

import com.jobayer.springcoredemo.common.Coach;
import com.jobayer.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
