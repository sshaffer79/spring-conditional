package com.shaffer.springconditional.service;

import com.shaffer.springconditional.condition.FeatureBCondition;
import com.shaffer.springconditional.dao.LoggingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(value= FeatureBCondition.class)
public class FeatureBService implements Feature {
    @Autowired
    @Qualifier(value = "slf4jLoggingDao")
    private LoggingDao dao;

    @Override
    public void run() {
        dao.log("Feature B");
    }
}