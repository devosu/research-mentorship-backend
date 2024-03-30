package com.dev.peerMentorResearch.DataModels;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "applicationForms")
public class ApplicationForm {
    
    @Id
    private String name;
    private String year;
    private String major;
    private String desiredResearchField;
    private String currentResearchField;
    private String descriptionOfCurrentResearch;
    private String type;


    //the type will distinguish between a mentor or mentee


    //Getters
    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }
  
    public String getMajor() {
        return major;
    }
    public String getDesiredResearchField() {
        return desiredResearchField;
    }
    public String getCurrentResearchField() {
        return currentResearchField;
    }
    public String getDescriptionOfCurrentResearch() {
        return descriptionOfCurrentResearch;
    }
    public String getType() {
        return type;
    }
 
    /**
     * will need way to differentiate between requiered fields for
     * mentors and mentees since we are storing them in the same collection
     */

    // Setters 
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void setMajor(String major) {
        this.major = major;
    }
   
    public void setDesiredResearchField(String desiredResearchField) {
        this.desiredResearchField = desiredResearchField;
    }
    public void setCurrentResearchField(String currentResearchField) {
        this.currentResearchField = currentResearchField;
    }
    
    public void setDescriptionOfCurrentResearch(String descriptionOfCurrentResearch) {
        this.descriptionOfCurrentResearch = descriptionOfCurrentResearch;
    }
    public void setType(String type) {
        this.type = type; 
    }
    
  
    }
