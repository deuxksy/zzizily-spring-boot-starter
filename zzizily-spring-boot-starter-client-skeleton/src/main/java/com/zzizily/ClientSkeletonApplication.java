package com.zzizily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ClientSkeletonApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientSkeletonApplication.class, args);
  }

  @RequestMapping("/users/{id}")
  public String index(Long id) {
    return new RestTemplate().getForObject("https://jsonplaceholder.typicode.com/users/{id}", String.class, id);
  }
}

