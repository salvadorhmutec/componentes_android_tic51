package com.blogspot.salvadorhm.componentestic51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_Radio_Button extends AppCompatActivity {

    private RadioGroup grupo;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__radio__button);

        grupo =(RadioGroup) findViewById(R.id.rg_colores);
    }
    public void RadioButton (View view){
        if(grupo.getCheckedRadioButtonId() == R.id.rb_azul){
            text  = "Selelcciono el RadioButton de color azul";
            Toast.makeText(this,text, Toast.LENGTH_LONG).show();
        }
        else if (grupo.getCheckedRadioButtonId() == R.id.rb_rojo){
            text  = "Selelcciono el RadioButton de color rojo";
            Toast.makeText(this,text, Toast.LENGTH_LONG).show();
        }
        else if (grupo.getCheckedRadioButtonId() == R.id.rb_verde){
            text  = "Selelcciono el RadioButton de color verde";
            Toast.makeText(this,text, Toast.LENGTH_LONG).show();
        }
    }
}
