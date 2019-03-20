package com.blogspot.salvadorhm.componentestic51;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Map_View extends AppCompatActivity {
    Button btnmapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);

       btnmapa =(Button) findViewById(R.id.btnmapa);

       btnmapa.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), MapsActivity1.class);
               startActivity(intent);

           }
       });
    }
}
