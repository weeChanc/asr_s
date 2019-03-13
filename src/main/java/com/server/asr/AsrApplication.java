package com.server.asr;

import analyze.Analyze;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsrApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsrApplication.class, args);
        Analyze.init("/home/c/IdeaProjects/asr");
    }

}
