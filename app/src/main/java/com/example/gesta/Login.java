package com.example.gesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Login extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private String nombre;


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
                login.putExtra("data_user", nombre);
                startActivity(login);
            }
        } else {
            Toast.makeText(this, "Debe ingresar su usuario y contraseña", Toast.LENGTH_LONG).show();
        }
    }

    private boolean autenticar() {
        try {
            InputStream inputS = getResources().openRawResource(R.raw.usuarios_datos);
            BufferedReader bufferedR = new BufferedReader(new InputStreamReader(inputS));
            String linea;
            String json = "";
            while ((linea = bufferedR.readLine()) != null) {
                json += linea;
            }
            inputS.close();
            JsonParser parser = new JsonParser();
            JsonArray gsonArray = parser.parse(json).getAsJsonArray();
            for (JsonElement obj : gsonArray) {
                JsonObject gsonObj = obj.getAsJsonObject();
                if (user.getText().toString().equals(gsonObj.get("user").getAsString())
                        && pass.getText().toString().equals(gsonObj.get("pass").getAsString())) {
                    nombre = gsonObj.get("nombre").getAsString();
                    return true;
                }
            }
            Toast.makeText(this, "Usuario y/o contraseña incorrectas", Toast.LENGTH_LONG).show();
            return false;
        } catch (Exception ex) {
            Toast.makeText(this, "Error en la conexión al autenticar", Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
