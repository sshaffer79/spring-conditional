package com.shaffer.springconditional.configuration;

import com.shaffer.springconditional.condition.FeatureACondition;
import com.shaffer.springconditional.condition.FeatureBCondition;
import com.shaffer.springconditional.service.Feature;
import com.shaffer.springconditional.service.FeatureAService;
import com.shaffer.springconditional.service.FeatureBService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureConfiguration {
    @Bean(name="featureService")
    @Conditional(value= FeatureACondition.class)
    public Feature getFeatureAService() {
        return new FeatureAService();
    }

    @Bean(name="featureService")
    @Conditional(value= FeatureBCondition.class)
    public Feature getFeatureBService() {
        return new FeatureBService();
    }
}
