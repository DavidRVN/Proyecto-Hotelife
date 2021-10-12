package com.example.hotelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(v->{
            showRegisterAdmin();
        });

    }

    protected void showRegisterAdmin(){
        Intent registerAdmin = new Intent(this,register_admin.class);
        startActivity(registerAdmin);
    }

}