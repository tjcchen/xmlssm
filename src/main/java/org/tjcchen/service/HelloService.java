package org.tjcchen.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello() {
        return "Hello Spring MVC! 北京";
    }

}
