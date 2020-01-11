package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,mobile,email,pwd,cpwd;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        mobile=findViewById(R.id.mobile);
        email=findViewById(R.id.email);
        pwd=findViewById(R.id.pwd);
        cpwd=findViewById(R.id.cpwd);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty())
                {
                    name.setError("Empty");
                    name.requestFocus();
                }
                else if(mobile.getText().toString().isEmpty())
                {
                    mobile.setError("Empty");
                    mobile.requestFocus();
                }
                else if(email.getText().toString().isEmpty())
                {
                    email.setError("Empty");
                    email.requestFocus();
                }
                else if(pwd.getText().toString().isEmpty())
                {
                    pwd.setError("Empty");
                    pwd.requestFocus();
                }
                else if(cpwd.getText().toString().isEmpty())
                {
                    cpwd.setError("Empty");
                    cpwd.requestFocus();
                }
                else
                {
                    if(cpwd.getText().toString().equals(pwd.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"sucsess", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        cpwd.setError("password missmatch");
                        cpwd.requestFocus();
                    }
                }
            }
        });

    }
}
