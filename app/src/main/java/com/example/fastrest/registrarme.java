package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrarme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarme);
    }
    public void ingresoLogin(View view){
        Intent intent = new Intent( registrarme.this, MainActivity.class );
        startActivity(intent);
    }
}
