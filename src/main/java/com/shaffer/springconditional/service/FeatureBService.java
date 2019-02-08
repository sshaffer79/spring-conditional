package com.shaffer.springconditional.service;

import com.shaffer.springconditional.dao.LoggingDao;
import org.springframework.beans.factory.annotation.Autowired;

public class FeatureBService implements Feature {
    @Autowired
    private LoggingDao dao;

    @Override
    public void run() {
        dao.log("Feature B");
    }
}
