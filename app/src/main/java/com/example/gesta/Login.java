package com.example.gesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText user;
    private EditText pass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      user= (EditText) findViewById(R.id.tv_user_nav);
      pass = (EditText) findViewById(R.id.txt_pass);
    }

    public void Login(View view){
        Intent login = new Intent(this, Main.class);
       login.putExtra("data_user", user.getText().toString());
        startActivity(login);
    }
}
