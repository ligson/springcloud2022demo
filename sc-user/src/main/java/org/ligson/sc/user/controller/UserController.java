package org.ligson.sc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://sc-shop/sc-shop/api/shop/test", String.class);
    }
}
