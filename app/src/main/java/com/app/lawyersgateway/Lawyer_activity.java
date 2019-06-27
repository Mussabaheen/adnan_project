package com.app.lawyersgateway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lawyer_activity extends AppCompatActivity {
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer_activity);
        i1=new Intent(this,signup_page_lawyer.class);

    }

    public void sign_up(View view) {
        startActivity(i1);
    }
}
