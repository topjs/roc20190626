package cn.utstarcom.controller;

import cn.utstarcom.entity.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by UTSC0107 on 2019/6/26.
 */
@RestController
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "UD") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/play")
    public String play(@RequestParam(value = "game", defaultValue = "basketball") String game) {
        return " I like to play " + game;
    }

    @RequestMapping("/test")
    public String test(@RequestParam(value = "aaa", defaultValue = "basketball") String aaa) {
        return " test  " + aaa;
    }
}
