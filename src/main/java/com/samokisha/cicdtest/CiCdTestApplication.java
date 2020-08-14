package com.samokisha.cicdtest;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CiCdTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdTestApplication.class, args);
    }

    @GetMapping("/**")
    public Map<String, String> request(HttpServletRequest request) {
        return Map.of("url", request.getRequestURL().toString());
    }
}
