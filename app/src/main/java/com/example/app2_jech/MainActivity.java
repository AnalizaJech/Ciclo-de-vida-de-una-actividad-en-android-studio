package com.example.app2_jech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast;
        Toast.makeText(getApplicationContext(), "onCreate, creando la actividad", Toast.LENGTH_LONG).show();
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart, iniciando la actividad", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast;
        Toast.makeText(getApplicationContext(), "onRestart, reiniciando la actividad", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast toast;
        Toast.makeText(getApplicationContext(), "onPause, actividad pausada", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast toast;
        Toast.makeText(getApplicationContext(), "onResume, actividad en primer plano", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast toast;
        Toast.makeText(getApplicationContext(), "onStop, actividad invisible", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast toast;
        Toast.makeText(getApplicationContext(), "onDestroy, actividad destruida", Toast.LENGTH_LONG).show();
    }
}