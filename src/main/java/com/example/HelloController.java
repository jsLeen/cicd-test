package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Member process(@RequestParam(name = "id") String id,
                          @RequestParam(name = "name") String name) {
        Member member = new Member();
        member.setId(Long.parseLong(id));
        member.setName(name);
        return member;
    }
}
