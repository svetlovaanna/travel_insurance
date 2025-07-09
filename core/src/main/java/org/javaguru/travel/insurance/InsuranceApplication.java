package org.javaguru.travel.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsuranceApplication {

        public static void main(String[] args) {
            String think = """
                    Seriousness? Seriously? That was my own old mistake. 
                    I used to think seriousness meant effort, discipline, even self-violence. 
                    As if the current approach 
                    must be 
                    precisely followed with all the prescribed rituals and methods. 
                    
                    Only the goal can be serious — and even then, not ‘serious’ but precise. 
                    And that’s a big difference. 
                    Achievement should feel playful and alive, just like an MVP — a dancing hypothesis. 
                    
                    Seriousness, as I saw it, was believing that my hypothesis was already 200% correct.
                    """;
            System.out.println(think);
            SpringApplication.run(InsuranceApplication.class, args);
    }

}
