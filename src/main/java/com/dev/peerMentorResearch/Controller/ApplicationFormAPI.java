package com.dev.peerMentorResearch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.peerMentorResearch.DataModels.ApplicationForm;
import com.dev.peerMentorResearch.Repository.ApplicationFormRepository;



@RestController

public class ApplicationFormAPI {


    @Autowired
    private ApplicationFormRepository applicationFormRepository;


    
    @PostMapping("/menteeFormSubmission") 
    public ResponseEntity<String> menteeSubmissionForm(@RequestBody ApplicationForm mentee) {
        mentee.setType("mentee");
        applicationFormRepository.save(mentee);
        return ResponseEntity.ok("Mentee application submitted successfully");
    }

    
    @PostMapping("/mentorFormSubmission") 
    public ResponseEntity<String> mentorSubmissionForm(@RequestBody ApplicationForm mentor) {
        mentor.setType("mentor");
        applicationFormRepository.save(mentor);
        return ResponseEntity.ok("Mentor application submitted successfully");
    }
}


