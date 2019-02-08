package com.shaffer.springconditional.dao;

import org.springframework.stereotype.Repository;

@Repository
public class SystemLoggingDao implements LoggingDao {
    public void log(String message) {
        System.out.println(message);
    }
}
