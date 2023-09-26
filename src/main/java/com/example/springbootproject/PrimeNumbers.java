package com.example.springbootproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class PrimeNumbers {
    @GetMapping("/primenumbers")
    public List<Integer> prime(@RequestParam(value="n",defaultValue = "10") int N) {
        List<Integer> Prime =new ArrayList<>();
        for(int x=1;x<N;x++) {
            if(x==1 || x==0) continue;
            int flag =1;
            for(int y=2;y<=x/2;++y) {
                if(x%y == 0) {
                    flag =0;
                    break;
                }
            }
            if(flag == 1) Prime.add(x);
        }
        return Prime;
    }
}