package com.realestate.suggestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.realestate")
public class PriceSuggestionApplication {

  public static void main(String[] args) {
    SpringApplication.run(PriceSuggestionApplication.class, args);
  }

}
