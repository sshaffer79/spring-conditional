package com.shaffer.springconditional.dao;

import org.springframework.stereotype.Repository;

public interface LoggingDao {
    void log(String message);
}
