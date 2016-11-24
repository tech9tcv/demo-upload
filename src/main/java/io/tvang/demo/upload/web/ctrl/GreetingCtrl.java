package io.tvang.demo.upload.web.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import io.tvang.demo.model.Greeting;

@RestController
public class GreetingCtrl extends AbstractCtrl {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();


  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
    System.out.println("==== in greeting ====");
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

}