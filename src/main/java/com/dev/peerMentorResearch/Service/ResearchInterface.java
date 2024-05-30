package com.dev.peerMentorResearch.Service;

import java.util.List;
import com.dev.peerMentorResearch.DataModels.ApplicationForm;

public interface ResearchInterface {

    // Story 1

    /**
     * Submits to and updates the database that stores the mentor applications
     * 
     * @param name
     * @param year
     * @param major
     * @param desiredResearchField
     * @param currentResearchField
     * @param descriptionOfCurrentResearch
     * @param type
     */
    void submitMenteeApplication(String name, String year, String major, String desiredResearchField,
            String currentResearchField, String descriptionOfCurrentResearch, String type);

    /**
     * Allows admin to approve or deny an application for a mentee
     * 
     * @param application
     * @param approve
     */
    void reviewApplication(ApplicationForm application, boolean approve);

    // Story 2

    /**
     * Allows mentee to update their profile picture, name, and bio.
     * 
     * @param name
     * @param profilePicture
     * @param bio
     */
    void editMentorProfile(String name, String profilePicture, String bio);
    // here we use a String for profilePicture because we assume it will be a link
    // to the image

    // Story 3

    /**
     * Notify mentee applicant of approval or denial and if approved send the
     * scheduling link,
     * if not send a message with the denial and next steps
     * 
     * @param applicationId
     * @param approved
     */
    void notifyStudentOfApproval(String applicationId, boolean approved);

    /**
     * Sends a scheduling link of the assigned mentor to the student
     * 
     * @param mentorId
     * @param studentId
     * @param appointmentLink
     */
    void sendAppointmentSchedulingLink(String mentorId, String studentId, String appointmentLink);

    // Additional

    /**
     * Returns a list of all applicants who are looking for a mentor and have
     * submitted an application
     * 
     * @return list of all applicants who are looking for a mentor
     */
    List<ApplicationForm> getMenteeApplications();

}
