package com.dev.peerMentorResearch.Repository;

import java.util.List;
import com.dev.peerMentorResearch.DataModels.ApplicationForm;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



/*
this interface allows me to use CRUD operations on restuarant collection by extending the mongo repositypry interface
*/

@Repository
public interface ApplicationFormRepository extends MongoRepository<ApplicationForm, String> {
    // You can define additional custom query methods here if needed
    
}

