package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button Login, Create;
    EditText nama,password;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama=findViewById(R.id.editTextText3);
        password=findViewById(R.id.editTextTextPassword2);
        Login=findViewById(R.id.button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user=nama.getText().toString();
                pass=password.getText().toString();

                if(user.equals("Nando"))  pass.equals("nando123");{
                    Toast.makeText(MainActivity2.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                }
            }
        });
        Create=findViewById(R.id.button2);
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity5.class));
            }
        });
    }
}