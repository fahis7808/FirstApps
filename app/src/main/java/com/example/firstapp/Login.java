package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText username , password;
    String un = "Admin";
    String pw = "abc@123";
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.usrname);
        password = (EditText) findViewById(R.id.paswrd);
        cancel = (Button) findViewById(R.id.cncl);

        cancel.setOnClickListener(this);
    }
        @Override
        public void onClick(View view) {

        finish();

        }



    public void login_the_app(View view) {

        String uname = username.getText().toString();
        String pswd = password.getText().toString();

            if (uname.equals(un) && pswd.equals(pw)){

                Intent i = new Intent(getApplicationContext(),FirstPage.class);
                startActivity(i);

        }else {
                Toast.makeText(getApplicationContext(),"Username or Password incorrect",Toast.LENGTH_LONG).show();
            }

    }


}