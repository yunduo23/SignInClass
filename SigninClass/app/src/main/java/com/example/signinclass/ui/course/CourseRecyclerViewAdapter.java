package com.example.signinclass.ui.course;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.signinclass.R;
import com.example.signinclass.publicModule.bean.CourseRecord;

import java.util.List;


public class CourseRecyclerViewAdapter extends RecyclerView.Adapter<CourseRecyclerViewAdapter.CourseViewHolder> {
    private List<CourseRecord> courseRecordsList;

    public CourseRecyclerViewAdapter(List<CourseRecord> courseData){
        this.courseRecordsList = courseData;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        CourseRecord courseRecord = courseRecordsList.get(position);
        holder.tv_collegeName.setText(courseRecord.collegeName);
        holder.tv_courseName.setText(courseRecord.courseName);
        Glide.with(holder.iv_image.getContext()).load(courseRecord.coursePhoto).placeholder(R.drawable.placeholder).error(R.drawable.placeholder).into(holder.iv_image);
    }

    @Override
    public int getItemCount() {
        return courseRecordsList.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder{
        public final ImageView iv_image;
        public final TextView tv_courseName;
        public final TextView tv_collegeName;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_image = (ImageView) itemView.findViewById(R.id.iv_image);
            tv_courseName = (TextView) itemView.findViewById(R.id.tv_courseName);
            tv_collegeName = (TextView) itemView.findViewById(R.id.tv_collegeName);
        }

    }
}


