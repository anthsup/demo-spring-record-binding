package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping
    public void test(RecordParamHolder paramHolder) {
        System.out.println("Record: " + paramHolder.recordParamName()); // not working when passing indexed param list
        System.out.println("POJO: " + paramHolder.pojoParamName()); // always working
    }
}
