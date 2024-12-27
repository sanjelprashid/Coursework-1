package com.Finaid.model;

public class ScholarshipModel {
    private int studentId;
    private String fullName;
    private String program;
    private double cgpa;
    private String familyIncome;
    private String scholarshipType;
    private String status;  // "Pending", "Approved", "Rejected"
    private String documents;  // Path to uploaded documents
   
    public ScholarshipModel() {
    }
   
    public ScholarshipModel(int studentId, String fullName, String program,
            double cgpa, String familyIncome, String scholarshipType,
            String status, String documents) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.program = program;
        this.cgpa = cgpa;
        this.familyIncome = familyIncome;
        this.scholarshipType = scholarshipType;
        this.status = status;
        this.documents = documents;
    }
   
    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }
   
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
   
    public String getFullName() {
        return fullName;
    }
   
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
   
    public String getProgram() {
        return program;
    }
   
    public void setProgram(String program) {
        this.program = program;
    }
   
    public double getCgpa() {
        return cgpa;
    }
   
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
   
    public String getFamilyIncome() {
        return familyIncome;
    }
   
    public void setFamilyIncome(String familyIncome) {
        this.familyIncome = familyIncome;
    }
   
    public String getScholarshipType() {
        return scholarshipType;
    }
   
    public void setScholarshipType(String scholarshipType) {
        this.scholarshipType = scholarshipType;
    }
   
    public String getStatus() {
        return status;
    }
   
    public void setStatus(String status) {
        this.status = status;
    }
   
    public String getDocuments() {
        return documents;
    }
   
    public void setDocuments(String documents) {
        this.documents = documents;
    }
}