package com.example.Connectremoteapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getInfo")
    public Object getInfo(){
        String url = "https://dummy.restapiexample.com/api/v1/employees";
        Object response =  restTemplate.getForObject(url, Object.class);
        return response;
    }

    @GetMapping("/getCustomizedInfo")
    public userResponse getCustomizedInfo(){
        String url = "https://dummy.restapiexample.com/api/v1/employees";
        userResponse response =  restTemplate.getForObject(url, userResponse.class);
        return response;
    }
}
