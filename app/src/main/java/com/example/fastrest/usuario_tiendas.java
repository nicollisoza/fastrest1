package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class usuario_tiendas extends AppCompatActivity {

    private TextView dire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_tiendas);
        dire = findViewById(R.id.direccion);
        dire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mapa.class);
                startActivity(intent);
            }
        });
    }
    public void ingresoUsuarioCategoria(View view){
        Intent intent = new Intent(usuario_tiendas.this, usuario_categoria.class );
        startActivity(intent);
    }
    public void ingresoUsuarioNotificaciones(View view){
        Intent intent = new Intent(usuario_tiendas.this, usuario_notificaciones.class );
        startActivity(intent);
    }
}
