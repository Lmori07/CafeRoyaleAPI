package com.example.loginapi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail,etPassword;
    Button btnLogin,btnRegister;
    String email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setTitle("LOGIN");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkLogin();
            }
        });
    }

    private void checkLogin()
    {
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();

        if(email.isEmpty() || password.isEmpty())
        {
            alertFail("Email and Password is required");
        }
        else
        {
            sendLogin();
        }
    }

    private void sendLogin()
    {
        Toast.makeText(this,"Send",Toast.LENGTH_SHORT).show();
    }

    private void alertFail(String s)
    {
        new AlertDialog.Builder(this)
                .setTitle("Failed")
                .setIcon(R.drawable.ic_warning)
                .setMessage(s)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
}