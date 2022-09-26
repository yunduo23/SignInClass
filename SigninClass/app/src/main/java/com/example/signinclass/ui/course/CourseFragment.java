package com.example.signinclass.ui.course;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.signinclass.databinding.FragmentCourseBinding;
import com.example.signinclass.publicModule.bean.CourseBean;
import com.example.signinclass.publicModule.network.CourseService;
import com.example.signinclass.publicModule.network.RetrofitClient;
import com.example.signinclass.ui.course.viewmodel.CourseViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CourseFragment extends Fragment {
    private FragmentCourseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CourseViewModel courseViewModel =
                new ViewModelProvider(this).get(CourseViewModel.class);

        binding = FragmentCourseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Retrofit retrofitInstance = RetrofitClient.getRetrofitInstance();
        CourseService courseService = retrofitInstance.create(CourseService.class);
        courseService.getAllCourseListByPaging(1,10).enqueue(new Callback<CourseBean>() {
            @Override
            public void onResponse(Call<CourseBean> call, Response<CourseBean> response) {
                Log.d("daigua", "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<CourseBean> call, Throwable t) {
                Log.d("daigua", "onResponse: " + t.getMessage());
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
