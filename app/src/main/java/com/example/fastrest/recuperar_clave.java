package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class recuperar_clave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_clave);
    }
    public void ingresoCodigo(View view){
        Intent intent = new Intent( recuperar_clave.this, codigo.class );
        startActivity(intent);
    }
}
