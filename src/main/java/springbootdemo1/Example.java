package springbootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Classname: Example
 * @ Description:
 * @ author: liyi
 * @ date: 2017/4/22 15:40
 * @ version: V1.0
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
     String home(){
         return "Hello World222!";
     }

     public static  void main(String args[]){
         SpringApplication.run(Example.class,args);
     }
}
