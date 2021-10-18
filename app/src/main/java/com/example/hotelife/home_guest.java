package com.example.hotelife;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class home_guest extends AppCompatActivity {

    private Spinner service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_guest);

        service= (Spinner) findViewById(R.id.service);

        ArrayList<String> elementos= new ArrayList<>();

        elementos.add("Elemento 1");
        elementos.add("Elemento 2");
        elementos.add("Elemento 3");
        elementos.add("Elemento 4");
        elementos.add("Elemento 5");
        elementos.add("Elemento 6");

        ArrayAdapter adp=new ArrayAdapter(home_guest.this, android.R.layout.simple_spinner_dropdown_item, elementos);

        service.setAdapter(adp);

        service.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String elemento= (String) service.getAdapter().getItem(0);

                Toast.makeText(home_guest.this, "Seleccionaste: "+elemento,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}