package com.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

    @org.junit.Test
    public void test(){
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }

    @org.junit.Test
    public void test2(){
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
