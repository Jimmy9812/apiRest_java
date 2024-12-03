package com.apiRest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

import java.util.Map;


@RestController
public class Controller {

    @GetMapping("/app")
    public Map<String, String> getMessage() {
        Map<String, String> json = new HashMap<>();
        json.put("message", "Hello World with Spring API REST jimmy ");
        return json;
    }

        @GetMapping("/nombre")
        public List<String> nombre() {
            return Arrays.asList("Hola", "Mundo", "desde", "Spring Boot");

    }
}
