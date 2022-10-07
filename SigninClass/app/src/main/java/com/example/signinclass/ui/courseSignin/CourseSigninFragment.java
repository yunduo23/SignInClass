package com.example.signinclass.ui.courseSignin;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.signinclass.R;
import com.example.signinclass.ui.courseSignin.viewmodel.CourseSigninViewModel;

public class CourseSigninFragment extends Fragment {

    private CourseSigninViewModel mViewModel;

    public static CourseSigninFragment newInstance() {
        return new CourseSigninFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_course_signin, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CourseSigninViewModel.class);
        // TODO: Use the ViewModel
    }

}