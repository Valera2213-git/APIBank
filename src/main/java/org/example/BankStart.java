package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

@SpringBootApplication
public class BankStart {
    static final Logger log = LoggerFactory.getLogger(BankStart.class);

    public static void main(String[] args) {
        log.info("Начало сборки контекста " + new Date());
        SpringApplication.run(BankStart.class, args);
        log.info("Начало работы приложения " + new Date());


    }
}

