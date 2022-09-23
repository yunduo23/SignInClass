package com.example.signinclass.ui.course;

public class Course {
    private String collegeName;
    private int courseId;
    private String courseName;
    private String coursePhoto;

    public String getCollegeName(){
        return collegeName;
    }

    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public void setCourseId(int courseId){
        this.courseId = courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCoursePhoto(){
        return coursePhoto;
    }

    public void setCoursePhoto(String coursePhoto){
        this.coursePhoto = coursePhoto;
    }
}
