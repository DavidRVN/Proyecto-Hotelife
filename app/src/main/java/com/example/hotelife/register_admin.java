package com.example.hotelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class register_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_admin);

        Button btn_continue = findViewById(R.id.btn_continue_register);
        btn_continue.setOnClickListener(v->{
            showVerification();
        });

    }

    protected void showVerification(){
        Intent verification = new Intent(this, verification.class);
        startActivity(verification);
    }
}