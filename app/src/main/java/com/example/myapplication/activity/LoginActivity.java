package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    Button Login ;
    EditText username,password;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        Login = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.etusername);
        password = (EditText) findViewById(R.id.etpassword);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (password.getText().toString().toUpperCase().equals("TEST1"))
                {
                 login_sukses();
                } else
                {
                    Toast.makeText(getApplicationContext(),"salah password", Toast.LENGTH_SHORT).show();

            }
        }

    });
}

    private void login_sukses() {
        String user = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirimkan username ke tampilan utama
        i.putExtra("USERNAME",user);
        startActivity(i);
    }
    }
