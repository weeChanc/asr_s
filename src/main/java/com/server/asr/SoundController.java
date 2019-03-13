package com.server.asr;


import analyze.Analyze;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController("/")
public class SoundController {

    @GetMapping("/recognize")
    String recognize(HttpServletRequest req, HttpServletResponse resp){
        long start = System.currentTimeMillis();
        Analyze.analyze("/home/c/IdeaProjects/asr/sound/SA1_.wav");
        return String.valueOf(System.currentTimeMillis() - start);
    }

}
