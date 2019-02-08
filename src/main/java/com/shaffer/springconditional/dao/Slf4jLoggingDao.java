package com.shaffer.springconditional.dao;

import com.shaffer.springconditional.condition.FeatureBCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Repository;

@Repository
@Conditional(value= FeatureBCondition.class)
public class Slf4jLoggingDao implements LoggingDao{
    private Logger logger = LoggerFactory.getLogger(Slf4jLoggingDao.class);

    @Override
    public void log(String message) {
        logger.info(message);
    }
}
