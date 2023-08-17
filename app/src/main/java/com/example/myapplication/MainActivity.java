package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner age = findViewById(R.id.age);
        Spinner phone = findViewById(R.id.phone);

        ArrayAdapter<CharSequence> arrayadapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_item);
        age.setAdapter(arrayadapter);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.phonenum, android.R.layout.simple_spinner_item);
        phone.setAdapter(adapter);

    }
}