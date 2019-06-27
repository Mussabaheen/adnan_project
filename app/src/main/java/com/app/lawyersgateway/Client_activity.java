package com.app.lawyersgateway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Client_activity extends AppCompatActivity {
    EditText username,password;
    TextView button_text,txt2;
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_activity);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password_text_client);
        button_text =(TextView)findViewById(R.id.log_in_client);
        i1=new Intent(this,signup_page_client.class);

    }

    public void sign_up(View view) {
        startActivity(i1);
    }
}
