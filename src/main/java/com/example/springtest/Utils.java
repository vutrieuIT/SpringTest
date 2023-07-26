package com.example.springtest;

import org.springframework.stereotype.Component;

@Component
public class Utils {
    public Long sum(Long a, Long b){
        return a + b;
    }
}
