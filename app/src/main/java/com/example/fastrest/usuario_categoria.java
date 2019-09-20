package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_categoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_categoria);
    }
    public void ingresoUsuarioProducto(View view){
        Intent intent = new Intent(usuario_categoria.this, usuario_producto.class );
        startActivity(intent);
    }
}
