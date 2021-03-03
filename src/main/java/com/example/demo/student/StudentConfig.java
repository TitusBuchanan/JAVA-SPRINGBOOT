package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return  args -> {
              Student titus = new Student(
                    1L,
                    "Titus",
                    "TItus@gmail.com",
                    LocalDate.of(1992, Month.JULY,3),
                    28


            );
            Student tom = new Student(
                    2L,
                    "Tom",
                    "Tom@gmail.com",
                    LocalDate.of(2000, Month.MARCH,3),
                    21


            );

            repository.saveAll(
                    List.of(titus, tom)
            );
        };
    }
}
