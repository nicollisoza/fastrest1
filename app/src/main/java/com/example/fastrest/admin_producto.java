package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin_producto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_producto);
    }
    public void ingresoAdminModProducto(View view){
        Intent intent = new Intent(admin_producto.this, admin_mod_producto.class );
        startActivity(intent);
    }
}
