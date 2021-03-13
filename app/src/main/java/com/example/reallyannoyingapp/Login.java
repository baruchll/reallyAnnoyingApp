
package com.example.reallyannoyingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText id_name,password;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init(){
        id_name = findViewById(R.id.id_name);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().length() >= 6 && id_name.getText().toString().length() >= 3){
                    Intent intent = new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    if (id_name.getText().toString().length() <= 3){
                        id_name.setError("enter more than 3 letters");
                    }
                    if (password.getText().toString().length() < 6){
                        password.setError("enter at least 6 digits");
                    }
                    Toast.makeText(Login.this, "put in better stuff",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}