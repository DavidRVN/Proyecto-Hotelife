package com.example.hotelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    String[] algo = {"1", "2", "3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(v->{
            showRegisterAdmin();
        });*/

        Spinner spin = (Spinner) findViewById(R.id.spinner);
      //  spin.setOnItemSelectedListener();

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,algo);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        Button btn_guest = findViewById(R.id.btn_login);
        btn_guest.setOnClickListener(v->{
            showRegisterGuest();
        });
   }

    protected void showRegisterAdmin(){
        Intent registerAdmin = new Intent(this,register_admin.class);
        startActivity(registerAdmin);
    }

    protected void showRegisterGuest(){
        Intent registerGuest = new Intent(this,register_guest.class);
        startActivity(registerGuest);
    }

}