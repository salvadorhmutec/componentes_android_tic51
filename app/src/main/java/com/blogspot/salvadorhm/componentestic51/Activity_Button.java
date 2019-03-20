package com.blogspot.salvadorhm.componentestic51;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Button extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__button);

        btn1= (Button) findViewById(R.id.btnBotonusandooncliCK);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"TIC 51",Toast.LENGTH_LONG).show();
            }
        });
    }
}
