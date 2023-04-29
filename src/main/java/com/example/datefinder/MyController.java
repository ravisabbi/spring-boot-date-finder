package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;  

@RestController
public class MyController {
          
          @GetMapping("/")
          public String gateFinder(){
                 LocalDate now = LocalDate.now();
                 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                 LocalDate date = now.plusDays(100);

                 String strDate = formatter.format(date);

                 return strDate;

          }
    
}
