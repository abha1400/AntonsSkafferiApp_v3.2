package com.example.mobile.antonsskafferiapp_v32;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainLogin extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText ePin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        ePin = (EditText) findViewById(R.id.Pin_id);
        bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(ePin.getContext().toString().equals("1234")){
          //  Intent intent = new intent("");
        }
    }
}
