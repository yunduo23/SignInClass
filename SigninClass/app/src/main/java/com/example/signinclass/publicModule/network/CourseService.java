package com.example.signinclass.publicModule.network;

import com.example.signinclass.publicModule.bean.CourseBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CourseService {
    @GET("member/sign/course/all")
    Call<CourseBean> getAllCourseListByPaging(@Query("current") int current, @Query("size") int size);
}
