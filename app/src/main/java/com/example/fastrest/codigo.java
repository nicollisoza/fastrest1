package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class codigo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo);
    }
    public void ingresoLogin(View view){
        Intent intent = new Intent(codigo.this, MainActivity.class );
        startActivity(intent);
    }
}
