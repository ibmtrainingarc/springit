package com.example.springit;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.springit.config.SpringitProperties;
import com.example.springit.entity.Comment;
import com.example.springit.entity.Link;
import com.example.springit.repository.CommentRepository;
import com.example.springit.repository.LinkRepository;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringitApplication.class);
	@Autowired
	private SpringitProperties springitProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link= new Link("practise1","www.google.com");
			linkRepository.save(link);
			
			Comment comment= new Comment("Learning!!",link);
			commentRepository.save(comment);
			link.addComment(comment);
			
			System.out.println(link.getComments());
			
			Link linkTitle = linkRepository.findByTitle("practise1");
			System.out.println(linkTitle.getTitle());
		};
	}

}
