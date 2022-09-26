package com.example.signinclass.publicModule.bean;

import androidx.annotation.NonNull;

import java.util.List;

public class CourseBean {
    @NonNull
    @Override
    public String toString() {
        return msg;
    }

    String msg;
    int code;
    CourseData data;
}


class CourseData{
    int current;
    List<CourseRecord> records;
    int size;
    int total;
}

class CourseRecord{
    String collegeName;
    int courseId;
    String courseName;
    String coursePhoto;
}