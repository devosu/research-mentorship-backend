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


    @SuppressWarnings("null")
    @PostMapping("/formSubmission")
    
    public ResponseEntity<String> submitForm(@RequestBody ApplicationForm applicant) {
        applicationFormRepository.save(applicant);
        return ResponseEntity.ok("Application submitted successfully");
    }
}


