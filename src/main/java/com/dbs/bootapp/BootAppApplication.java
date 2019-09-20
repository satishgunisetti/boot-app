package com.dbs.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

@SpringBootApplication
public class BootAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootAppApplication.class, args);


        Supplier<String> s = () -> {
            String otp = "";

            for(int i = 0; i < 6; i ++){
                Random r = new Random();
                otp += r.ints(0, 10).findFirst().getAsInt();
            }
            return otp;
        };



        System.out.println(s.get());


	}

}
