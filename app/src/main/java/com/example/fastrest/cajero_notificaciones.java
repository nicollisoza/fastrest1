package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cajero_notificaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cajero_notificaciones);
    }
    public void ingresoCajeroNotificacionesMod(View view){
        Intent intent = new Intent(cajero_notificaciones.this, cajero_notificaciones_mod.class );
        startActivity(intent);
    }
}
