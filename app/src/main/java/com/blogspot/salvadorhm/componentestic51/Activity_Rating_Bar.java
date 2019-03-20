package com.blogspot.salvadorhm.componentestic51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Activity_Rating_Bar extends AppCompatActivity {
    RatingBar rb_calificar;
    Button btn_calificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__rating__bar);
        rb_calificar= (RatingBar) findViewById(R.id.rb_calificar);
        btn_calificar= (Button) findViewById(R.id.btn_calificar);
        btn_calificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating= String.valueOf(rb_calificar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}