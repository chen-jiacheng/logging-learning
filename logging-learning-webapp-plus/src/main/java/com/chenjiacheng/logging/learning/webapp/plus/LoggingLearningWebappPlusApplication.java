package com.chenjiacheng.logging.learning.webapp.plus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chenjiacheng on 2025/7/8 17:27
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@SpringBootApplication
public class LoggingLearningWebappPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoggingLearningWebappPlusApplication.class, args);
        log.info("logging-learning-webapp-plus has been started!");
    }
}