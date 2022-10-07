package com.example.signinclass.ui.studentCourseSigninHistory;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.signinclass.R;

public class studentCourseSigninHistoryFragment extends Fragment {

    private StudentCourseSigninHistoryViewModel mViewModel;

    public static studentCourseSigninHistoryFragment newInstance() {
        return new studentCourseSigninHistoryFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_student_course_signin_history, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(StudentCourseSigninHistoryViewModel.class);
        // TODO: Use the ViewModel
    }

}