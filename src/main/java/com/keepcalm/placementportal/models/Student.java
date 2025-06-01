package com.keepcalm.placementportal.models;

import java.util.List;

public class Student {
    private static final long uuid = 1L;
    private String studentId;
    private String prnNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String fatherName;
    private String motherName;
    private String contactNumber;
    private String alternateContactNumber;
    private String personalMailAddress;
    private String officialMailAddress;
    private String fatherContactNumber;
    private String motherContactNumber;
    private String collegeName;
    private String collegeRollNumber;

    private List<EducationDetails> educationDetailsList;
    private List<Experience> experienceList;
    private List<Achievement> achievementList;
    private List<Certification> certificationList;
    private List<Project> projectList;
    private List<SocialAccount> socialAccountList;

}
