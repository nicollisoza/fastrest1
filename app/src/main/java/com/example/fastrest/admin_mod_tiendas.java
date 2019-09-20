package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_mod_tiendas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mod_tiendas);
    }
    public void ingresoAdminTiendas(View view){
        Intent intent = new Intent(admin_mod_tiendas.this, admin_tiendas.class );
        startActivity(intent);
    }
}
