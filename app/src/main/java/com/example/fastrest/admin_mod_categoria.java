package com.example.fastrest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class admin_mod_categoria extends AppCompatActivity {
    private EditText nombreCat;
    private Button guardarCat;
    private FirebaseDatabase firebaseDatabase;
    private String nombre;
    private DatabaseReference databaseReference;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mod_categoria);
        inicializar();
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();
        guardarCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre = nombreCat.getText().toString();
                double a = (int) Math.random();
                Date date = new Date();
                date.getTime();
                String randomId = Double.toString(a);
                if(!nombre.isEmpty()){
                    Map<String,Object> map = new HashMap();
                    map.put("nombreCategoria", nombre);
                    databaseReference.child("categoria").child(Long.toString(date.getTime())).setValue(map);
                    Toast.makeText(admin_mod_categoria.this, "Se ha guardado la información", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else{
                    Toast.makeText(admin_mod_categoria.this, "Escriba una categoria", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void inicializar() {
        nombreCat = findViewById(R.id.catNombre);
        guardarCat = findViewById(R.id.catGuardar);
    }

    public void ingresoAdminCagegoria(View view){
        Intent intent = new Intent(admin_mod_categoria.this, admin_categoria.class );
        startActivity(intent);
    }
}
