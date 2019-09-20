package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_registrarme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_registrarme = (Button)findViewById(R.id.btn_registro);

    }
    public void ingresoRegistrarme(View view){
        Intent intent = new Intent(MainActivity.this, registrarme.class );
        startActivity(intent);
    }
    public void ingresoRecuperarClave(View view){
        Intent intent = new Intent(MainActivity.this, recuperar_clave.class );
        startActivity(intent);
    }
    public void ingresoTipoUsuario(View view){
        Intent intent = new Intent(MainActivity.this, tipo_usuario.class );
        startActivity(intent);
    }

}
