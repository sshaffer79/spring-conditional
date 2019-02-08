package com.shaffer.springconditional.service;

import com.shaffer.springconditional.dao.LoggingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FeatureAService implements Feature {
    @Autowired
    @Qualifier(value = "systemLoggingDao")
    private LoggingDao dao;

    @Override
    public void run() {
        dao.log("Feature A");
    }
}
