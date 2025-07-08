package org.javaguru.travel.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsuranceApplication {

        public static void main(String[] args) {
            String question = """
                    I wonder when I'll be able to configure 
                    my brain to work 
                    in ambiguity and uncertainty mode?
                    """;
            System.out.println(question);
            SpringApplication.run(InsuranceApplication.class, args);
    }

}
