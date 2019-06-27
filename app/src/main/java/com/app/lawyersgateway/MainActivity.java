package com.app.lawyersgateway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lawyer_pressed(View view) {
        i1=new Intent(this,Lawyer_activity.class);
        startActivity(i1);

    }

    public void Client_pressed(View view) {
        i1=new Intent(this,Client_activity.class);
        startActivity(i1);
    }
}
