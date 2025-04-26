package edu.pzks.opensource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("/api/v1/simple/")
public class SimpleController {

    @GetMapping("hello")
    public String getSimpleHello() {
        return "Simple Hello world!";
    }

    @GetMapping("time")
    public ZonedDateTime getCurrentTime() {
        return ZonedDateTime.now();
    }

    @GetMapping("bye")
    public String getSimpleBye() {
        return "Simple bye!";
    }

}
