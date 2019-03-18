package com.blogspot.salvadorhm.componentestic51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Activity_Toggle_Button extends AppCompatActivity {

    ToggleButton tgbtn;
    TextView txEti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__toggle__button);
        tgbtn=findViewById(R.id.tbBtn1);
        txEti=(TextView) findViewById(R.id.textView3);
    }
    public void onDefaultToggleClick(View view) {
        Toast.makeText(this, "DefaultToggle", Toast.LENGTH_SHORT).show();
    }

    public void onToggleClick(View view) {
        if (view.getId() == R.id.tbBtn1) {
            if (tgbtn.isChecked()) {
                txEti.setText("Boton On");
            } else {
                txEti.setText("Boton Off");
            }
        }
    }
}
