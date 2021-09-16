package com.example.springbootstudyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // JAP Auditing 활성화
@SpringBootApplication
public class SpringbootStudyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyWebApplication.class, args);
    }

}
