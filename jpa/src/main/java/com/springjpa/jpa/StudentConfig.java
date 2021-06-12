package com.springjpa.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student s = Student.builder()
                    .firstName("Maria")
                    .lastName("Jones")
                    .email("maria.jones@gmail.com")
                    .age(12)
                    .build();

            studentRepository.save(s);
        };
    }
}
