package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_pedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_pedido);
    }
    public void ingresoUsuarioConfirmacion(View view){
        Intent intent = new Intent(usuario_pedido.this, usuario_condirmacion.class );
        startActivity(intent);
    }
}
