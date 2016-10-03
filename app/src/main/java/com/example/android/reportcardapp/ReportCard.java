package com.example.android.reportcardapp;

public class ReportCard {

    private String subjectName;
    private String gradeAssigned;
    private int imageResource;
    private double gradeNum;

    //ReportCard class constructor
    public ReportCard(String subject, String grade, int imageResourceId) {
        subjectName = subject;
        gradeAssigned = grade;
        imageResource = imageResourceId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getAssignedGrade() {
        return gradeAssigned;
    }

    public int getImageResourceId() {
        return imageResource;
    }

    //The purpose of this method is to allow for any letter grade to be assigned an equivalent GPA
    public double calcGradePointAvg() {
        switch (gradeAssigned) {
            case "A":
                gradeNum = 4.0;
                break;
            case "A-":
                gradeNum = 3.7;
                break;
            case "B+":
                gradeNum = 3.3;
                break;
            case "B":
                gradeNum = 3.0;
                break;
            case "B-":
                gradeNum = 2.7;
                break;
            case "C+":
                gradeNum = 2.3;
                break;
            case "C":
                gradeNum = 2.0;
                break;
            case "C-":
                gradeNum = 1.7;
                break;
            case "D+":
                gradeNum = 1.3;
                break;
            case "D":
                gradeNum = 1.0;
                break;
            case "D-":
                gradeNum = 0.7;
                break;
            case "F":
                gradeNum = 0.0;
                break;
        }
        return gradeNum;
    }

    //Convert subject and gpa into a string to display to the user
    @Override
    public String toString() {
        return "Your grade point equivalent for " + subjectName + " is " + calcGradePointAvg();
    }

}

