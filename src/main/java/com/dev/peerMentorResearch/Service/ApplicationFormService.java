package com.dev.peerMentorResearch.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.peerMentorResearch.DataModels.ApplicationForm;
import com.dev.peerMentorResearch.Repository.ApplicationFormRepository;

public class ApplicationFormService {
    

    @Autowired
    private ApplicationFormRepository applicationFormRepository;

    public void processForm(ApplicationForm form) {
        // Logic to handle setting the type and removing unused data fields
        if ("mentor".equals(form.getType())) {

            // Remove mentee-specific fields
        } else if ("mentee".equals(form.getType())) {
            // Remove mentor-specific fields
            
        }
        // Save the form to the database
    }
}



