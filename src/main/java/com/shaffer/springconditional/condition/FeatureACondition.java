package com.shaffer.springconditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class FeatureACondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String feature = context.getEnvironment().getProperty("feature");
        return feature.equalsIgnoreCase("A");
    }
}
