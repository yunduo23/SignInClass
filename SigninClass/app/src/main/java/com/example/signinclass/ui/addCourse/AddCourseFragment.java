package com.example.signinclass.ui.addCourse;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.signinclass.R;
import com.example.signinclass.databinding.FragmentAddCourseBinding;
import com.example.signinclass.ui.addCourse.viewmodel.AddCourseViewModel;

public class AddCourseFragment extends Fragment {

    private FragmentAddCourseBinding fragmentAddCourseBinding;
    private AddCourseViewModel mViewModel;

    public static AddCourseFragment newInstance() {
        return new AddCourseFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        AddCourseViewModel addCourseViewModel = new ViewModelProvider(this).get(AddCourseViewModel.class);

        fragmentAddCourseBinding = FragmentAddCourseBinding.inflate(getLayoutInflater());
        View root = fragmentAddCourseBinding.getRoot();
        Log.d("addcourseView", String.valueOf(root));

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddCourseViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.course_menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_course:
//                Intent intent = new Intent()
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}