package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cajero_notificaciones_mod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cajero_notificaciones_mod);
    }
    public void ingresoCajeroNotificaciones(View view){
        Intent intent = new Intent(cajero_notificaciones_mod.this, cajero_notificaciones.class );
        startActivity(intent);
    }
}
