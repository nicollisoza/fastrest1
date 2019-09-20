package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_producto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_producto);
    }
    public void ingresoUsuarioPedido(View view){
        Intent intent = new Intent(usuario_producto.this, usuario_pedido.class );
        startActivity(intent);
    }
}
