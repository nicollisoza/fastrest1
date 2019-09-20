package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tipo_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_usuario);
    }
    public void ingresoAdminTiendas(View view){
        Intent intent = new Intent(tipo_usuario.this, admin_tiendas.class );
        startActivity(intent);
    }
    public void ingresoUsuarioTiendas(View view){
        Intent intent = new Intent(tipo_usuario.this, usuario_tiendas.class );
        startActivity(intent);
    }
    public void ingresoCajeroNotificaciones(View view){
        Intent intent = new Intent(tipo_usuario.this, cajero_notificaciones.class );
        startActivity(intent);
    }
}
