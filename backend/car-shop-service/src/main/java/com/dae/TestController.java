package com.dae;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Igor Gudkov.
 */

@RestController
public class TestController {

    @RequestMapping(value = "/hi")
    public String hello() {
        return "Hello World!";
    }
}