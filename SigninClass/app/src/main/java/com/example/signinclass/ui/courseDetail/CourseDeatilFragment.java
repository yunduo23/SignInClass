package com.example.signinclass.ui.courseDetail;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.signinclass.R;
import com.example.signinclass.ui.courseDetail.viewmodel.CourseDeatilViewModel;

public class CourseDeatilFragment extends Fragment {

    private CourseDeatilViewModel mViewModel;

    public static CourseDeatilFragment newInstance() {
        return new CourseDeatilFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_course_deatil, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CourseDeatilViewModel.class);
        // TODO: Use the ViewModel
    }

}