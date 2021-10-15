package com.example.hotelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        Button btn_verification = findViewById(R.id.btn_verification) ;
        btn_verification.setOnClickListener(v -> {
            showHome();
        });

    }
    protected void showHome(){
        Intent home_admin = new Intent(this, com.example.hotelife.home_admin.class);
        startActivity(home_admin);
    }
}