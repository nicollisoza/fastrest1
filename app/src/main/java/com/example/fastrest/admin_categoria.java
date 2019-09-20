package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_categoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_categoria);
    }
    public void ingresoAdminModCategoria(View view){
        Intent intent = new Intent(admin_categoria.this, admin_mod_categoria.class );
        startActivity(intent);
    }
    public void ingresoAdminProducto(View view){
        Intent intent = new Intent(admin_categoria.this, admin_producto.class );
        startActivity(intent);
    }
}
