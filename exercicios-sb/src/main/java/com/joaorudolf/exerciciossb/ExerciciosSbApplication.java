package com.joaorudolf.exerciciossb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication (scanBasePackages={"com.joaorudolf.exerciciossb.controllers","\"com.joaorudolf.exerciciossb.entities\""}),
@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class ExerciciosSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosSbApplication.class, args);
	}

}
