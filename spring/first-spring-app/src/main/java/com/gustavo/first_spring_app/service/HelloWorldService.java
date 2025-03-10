package com.gustavo.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
  public String helloWorld(String name) {
    return "HelloWorld " + name;
  }
}
