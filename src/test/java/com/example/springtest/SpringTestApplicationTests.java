package com.example.springtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestApplicationTests {

    @Autowired
    private Utils utils;

    @Test
    void testUtils1() {
        // test 1
        Long expected1  = 35L;
        Long res1 = utils.sum(12L, 23L);
        Assertions.assertEquals(expected1, res1, "expected is 35");

    }

    @Test
    void testUtils2(){
        // test 2
        Long expected2  = 100L;
        Long res2 = utils.sum(-23L, 223L);
        Assertions.assertEquals(expected2, res2, "expected is 100");
    }
}
