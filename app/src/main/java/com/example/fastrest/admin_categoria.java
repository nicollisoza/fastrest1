package com.example.fastrest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class admin_categoria extends AppCompatActivity {

    private ArrayList<String> categorias = new ArrayList<>();
    ArrayAdapter<String> arrayAdapterCategoria;
    private ListView listaCategoria;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_categoria);
        listaCategoria = findViewById(R.id.categ);
        databaseReference = FirebaseDatabase.getInstance().getReference();
        arrayAdapterCategoria = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categorias);
        listaCategoria.setAdapter(arrayAdapterCategoria);
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String datos = dataSnapshot.getValue(categoria.class).toString();
                categorias.add(datos);
                arrayAdapterCategoria.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
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
