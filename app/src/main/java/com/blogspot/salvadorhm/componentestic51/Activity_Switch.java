package com.blogspot.salvadorhm.componentestic51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Switch extends AppCompatActivity {


    TextView xtxEti;
    Switch switchE;
    private Toast txtEti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__switch);

        TextView txtEti = (TextView) findViewById(R.id.etiSeleccion);
        switchE= findViewById(R.id.switch1);
    }

    public void onclick(View view) {

        if (view.getId() == R.id.switch1) ;
        if (switchE.isChecked()) {
            txtEti.setText("fue activado");
        } else {
            txtEti.setText("fue inactivado");
        }
    }
}


