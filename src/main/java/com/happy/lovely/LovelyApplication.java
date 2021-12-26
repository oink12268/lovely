package com.happy.lovely;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class LovelyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovelyApplication.class, args);

        log.info("*----------------*");
        log.info("|                |");
        log.info("|   SUCCESS !!!  |");
        log.info("|                |");
        log.info("*----------------*");
    }

}
