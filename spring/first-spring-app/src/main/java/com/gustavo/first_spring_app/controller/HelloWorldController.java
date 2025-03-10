package com.gustavo.first_spring_app.controller;

import com.gustavo.first_spring_app.domain.User;
import com.gustavo.first_spring_app.service.HelloWorldService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

  // dependency injection
  @Autowired
  private HelloWorldService helloWorldService;

  // public HelloWorldController(HelloWorldService helloWorldSerivce) {
  // this.helloWorldService = helloWorldSerivce;
  // }

  @GetMapping
  public String helloWorld() {
    return helloWorldService.helloWorld(" Gustavo");

  }

  @PostMapping("/{id}")
  public String helloWorldPost(@PathVariable String id,
      @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
    return String.format("Hello World " + body.getName() + " %s %s", id, filter);
  }
}
