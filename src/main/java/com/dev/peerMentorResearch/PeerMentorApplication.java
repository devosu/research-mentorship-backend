package com.dev.peerMentorResearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PeerMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeerMentorApplication.class, args);
	}

	@GetMapping("/")
	public String landingPage() {
		return "Welcome to Peer Mentor Research Application";
	}

}
