package com.example.JavaStreamsLesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStreamsLessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStreamsLessonApplication.class, args);
		List<Person> people=getPeople();
// Imperative approach

		List<Person>  females= new ArrayList<>();

		for (Person person: people){
			if(person.getGender().equals(Gender.FEMALE)){
				females.add(person);
			}
		}
		System.out.println(females);
	}


	@Bean
	private static List<Person> getPeople(){
		return List.of(
				new Person("James Bond", 20, Gender.MALE),
				new Person("Hlina", 30, Gender.FEMALE),
				new Person("Brook", 90, Gender.MALE),
				new Person("ALem", 20, Gender.FEMALE),
				new Person("John Doe", 28, Gender.MALE),
				);
	}

}
