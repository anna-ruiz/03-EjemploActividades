package com.example.a03_ejemploactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.e("ESTADOS","1- En el método onCreate TERCERO");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2- En el método onStart del TERCERO");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3- En el método onResume del TERCERO");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4- En el método onPause del TERCERO");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5- En el método onStop del TERCERO");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS","6- En el método onRestart del TERCERO");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "7- En el método onDestroy del TERCERO");
    }

}