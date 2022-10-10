package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.dao.PatientRepository;
import com.example.demo.entities.Patient;

@SpringBootApplication
public class SpringmvcApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}
	@Bean
	CommandLineRunner start(PatientRepository patientRepository) {
		return (args)->{
			/*patientRepository.save(new Patient(null,"rida",new Date(),true));
			patientRepository.save(new Patient(null,"othmane",new Date(),false));
			patientRepository.save(new Patient(null,"imad",new Date(),false));*/
			patientRepository.findAll().forEach(pat->{
				System.out.println(pat.toString());
			});
		};
	}
}
