package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_tiendas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_tiendas);
    }

    public void ingresoAdminModTiendas(View view){
        Intent intent = new Intent(admin_tiendas.this, admin_mod_tiendas.class );
        startActivity(intent);
    }
    public void ingresoCategoria(View view){
        Intent intent = new Intent(admin_tiendas.this, admin_categoria.class );
        startActivity(intent);
    }
}
