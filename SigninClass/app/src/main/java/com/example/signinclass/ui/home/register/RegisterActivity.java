package com.example.signinclass.ui.home.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.signinclass.R;

public class RegisterActivity extends AppCompatActivity {

    EditText username = null;
    EditText Pwd = null;
    EditText RPwd = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.et_username);
        Pwd = findViewById(R.id.et_pwd);
        RPwd = findViewById(R.id.et_pwd_repeat);

    }
}