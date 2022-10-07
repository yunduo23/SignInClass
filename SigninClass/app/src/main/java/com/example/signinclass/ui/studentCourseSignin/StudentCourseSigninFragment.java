package com.example.signinclass.ui.studentCourseSignin;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.signinclass.R;
import com.example.signinclass.ui.studentCourseSignin.viewmodel.StudentCourseSigninViewModel;

public class StudentCourseSigninFragment extends Fragment {

    private StudentCourseSigninViewModel mViewModel;

    public static StudentCourseSigninFragment newInstance() {
        return new StudentCourseSigninFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_student_course_signin, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(StudentCourseSigninViewModel.class);
        // TODO: Use the ViewModel
    }

}