package com.deocampo.gsb;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.deocampo.gsb.bms.model.*;

@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
	@Bean
	CommandLineRunner init(AccountRepository accountRepository,
			BookmarkRepository bookmarkRepository) {
		return (evt) -> Arrays.asList(
				"dondi,leo,josh,liza,mimie,lolo,lola,anshul".split(","))
				.forEach(
						a -> {
							Account account = accountRepository.save(new Account(a,
									"password"));
							bookmarkRepository.save(new Bookmark(account,
									"http://bookmark.com/1/" + a, "A description"));
							bookmarkRepository.save(new Bookmark(account,
									"http://bookmark.com/2/" + a, "A description"));
						});
	}
	
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
    

}
