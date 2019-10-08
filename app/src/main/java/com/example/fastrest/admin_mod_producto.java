package com.example.fastrest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class admin_mod_producto extends AppCompatActivity {

    private String APP_DIRECTORY = "myPicture/";
    private String MEDIA_DIRECTORY = APP_DIRECTORY+ "media";
    private String TEMPORAL_PICTURE_NAME = "temporal";

    private final int PHOTO_CODE = 100;
    private final int SELECT_PICTURE = 200;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mod_producto);
        imageView = findViewById(R.id.foto);
        Button button = findViewById(R.id.cargar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CharSequence[] opcion = {"Tomar foto","Galeria", "Salir"};
                final AlertDialog.Builder builder = new AlertDialog.Builder(admin_mod_producto.this);
                builder.setTitle("Elige una opción");
                builder.setItems(opcion, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(opcion[i] == "Tomar foto"){
                            dispatchTakePictureIntent();
                        }
                        else if(opcion[i] == "Galeria"){
                            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                            intent.setType("image/*");
                            startActivityForResult(intent.createChooser(intent, "Selecciona app"), SELECT_PICTURE);
                        }
                        else if (opcion[i] == "Salir"){
                            dialogInterface.dismiss();
                        }
                    }
                });
                builder.show();
            }
        });
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode){
            case REQUEST_IMAGE_CAPTURE:
                if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
                    Bundle extras = data.getExtras();
                    Bitmap imageBitmap = (Bitmap) extras.get("data");
                    imageView.setImageBitmap(imageBitmap);
                }
                break;
            case SELECT_PICTURE:
                if(resultCode == RESULT_OK){
                    Uri path = data.getData();
                    imageView.setImageURI(path);
                }
                break;
        }
    }

    private void decodeBitMap(String dir) {
        Bitmap bitmap;
        bitmap = BitmapFactory.decodeFile(dir);
        imageView.setImageBitmap(bitmap);
    }

    public void ingresoAdminProducto(View view){
        Intent intent = new Intent(admin_mod_producto.this, admin_producto.class );
        startActivity(intent);
    }
}
