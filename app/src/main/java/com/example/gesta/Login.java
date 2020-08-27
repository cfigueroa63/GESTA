package com.example.gesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;


public class Login extends AppCompatActivity {

    private EditText user;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.tv_user_nav);
        pass = (EditText) findViewById(R.id.txt_pass);
    }

    public void login(View view) {
        if (user.getText().length() != 0 && pass.getText().length() != 0) {
            if (autenticar()) {
                Intent login = new Intent(this, Main.class);
                login.putExtra("data_user", user.getText().toString());
                startActivity(login);
            } else {
                Toast.makeText(this, "Usuario y/o contraseña incorrectas", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Debe ingresar su usuario y contraseña", Toast.LENGTH_LONG).show();
        }
    }

    private boolean autenticar() {
        return true;
}
}
