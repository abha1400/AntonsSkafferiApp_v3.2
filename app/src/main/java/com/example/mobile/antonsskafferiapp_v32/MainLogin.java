package com.example.mobile.antonsskafferiapp_v32;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainLogin extends AppCompatActivity {

    Button bLogin;
    EditText ePin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        ePin = (EditText) findViewById(R.id.Pin_id);
        bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(ePin.getText().toString().equals("1234")){
                    Intent myIntent = new Intent(v.getContext(), table.class);
                    startActivityForResult(myIntent, 0);
                //  Intent intent = new intent("");

                }
                else{
                    Toast.makeText(getApplicationContext(), "Fel pin-kod", Toast.LENGTH_SHORT). show();
                }
            }
        });
    }

}