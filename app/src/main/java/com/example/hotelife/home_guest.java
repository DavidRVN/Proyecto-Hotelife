package com.example.hotelife;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class home_guest extends AppCompatActivity {

    private Spinner service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_guest);



         //pendiente para prueba (acordeon)
       /* Button FindMagicButton = (Button) findViewById(R.id.best_btn);
        FindMagicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout findMagicLl = (LinearLayout) findViewById(R.id.magic_layout);
                if (findMagicLl.getVisibility() != View.VISIBLE) {
                    findMagicLl.setVisibility(View.VISIBLE);
                } else {
                    findMagicLl.setVisibility(View.GONE);
                }
            }
        });

        ScaleAnimation animation = new ScaleAnimation(1f, 1f, 1f, 0f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f);
        animation.setDuration(180);
        animation.setFillAfter(true);
        FindMagicButton.startAnimation(animation);*/










        /*Spinner spinCountry;
        spinCountry= (Spinner) findViewById(R.id.spinCountry);//fetch the spinner from layout file
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getResources()
                .getStringArray(R.array.country_array));//setting the country_array to spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinCountry.setAdapter(adapter);*/









    }
}