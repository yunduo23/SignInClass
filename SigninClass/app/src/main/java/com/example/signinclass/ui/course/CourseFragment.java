package com.example.signinclass.ui.course;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.signinclass.databinding.FragmentCourseBinding;
import com.example.signinclass.publicModule.bean.CourseBean;
import com.example.signinclass.publicModule.bean.CourseData;
import com.example.signinclass.publicModule.bean.CourseRecord;
import com.example.signinclass.publicModule.network.CourseService;
import com.example.signinclass.publicModule.network.RetrofitClient;
import com.example.signinclass.ui.course.viewmodel.CourseViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CourseFragment extends Fragment {
    private FragmentCourseBinding binding;
    private CourseRecyclerViewAdapter courseRecyclerViewAdapter;
    private List<CourseRecord> courseRecordList = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CourseViewModel courseViewModel =
                new ViewModelProvider(this).get(CourseViewModel.class);

        binding = FragmentCourseBinding.inflate(getLayoutInflater());
//        binding = FragmentCourseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.courseRecyclerview.setLayoutManager(new LinearLayoutManager(this.requireContext(), LinearLayoutManager.HORIZONTAL,false));
        courseRecyclerViewAdapter = new CourseRecyclerViewAdapter(courseRecordList);
        binding.courseRecyclerview.setAdapter(courseRecyclerViewAdapter);
        Retrofit retrofitInstance = RetrofitClient.getRetrofitInstance();
        CourseService courseService = retrofitInstance.create(CourseService.class);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                courseService.getAllCourseListByPaging(0,10).enqueue(new Callback<CourseBean>() {
                    @Override
                    public void onResponse(Call<CourseBean> call, Response<CourseBean> response) {
                        CourseBean courseBean = response.body();
                        CourseData courseData = courseBean.data;
                        courseRecordList = courseData.records;
                        courseRecyclerViewAdapter = new CourseRecyclerViewAdapter(courseRecordList);
                        binding.courseRecyclerview.setAdapter(courseRecyclerViewAdapter);
                    }

                    @Override
                    public void onFailure(Call<CourseBean> call, Throwable t) {

                    }
                });
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
