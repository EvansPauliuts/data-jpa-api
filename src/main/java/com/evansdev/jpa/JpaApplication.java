package com.evansdev.jpa;

import com.evansdev.jpa.models.Author;
import com.evansdev.jpa.models.Video;
import com.evansdev.jpa.repositories.AuthorRepository;
import com.evansdev.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	) {
		return args -> {
			/*
			var author = Author.builder()
					.firstName("John")
					.lastName("Doe")
					.age(40)
					.email("john@doe.com")
					.createdAt(LocalDateTime.now())
					.build();

			authorRepository.save(author);
			 */
			var video = Video.builder()
					.name("Video#1")
					.length(15)
					.build();
			videoRepository.save(video);
		};
	}

}
