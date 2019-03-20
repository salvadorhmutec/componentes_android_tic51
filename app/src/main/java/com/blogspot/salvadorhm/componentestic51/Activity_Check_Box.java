package com.blogspot.salvadorhm.componentestic51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_Check_Box extends AppCompatActivity {

    private CheckBox mGoogleCheck, mBigCheck, mYahooCheck;
    private Button mWriteResultButton;
    private TextView mResultTextView;
    private ArrayList<String> mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__check__box);

        mGoogleCheck = findViewById(R.id.check_google);
        mBigCheck = findViewById(R.id.check_big);
        mYahooCheck = findViewById(R.id.check_yahoo);

        mWriteResultButton = findViewById(R.id.write_result);
        mResultTextView = findViewById(R.id.result);
        mResult = new ArrayList<>();
        mResultTextView.setEnabled(false);

        mGoogleCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mGoogleCheck.isChecked())
                    mResult.add("**Google**");
                else
                    mResult.remove("**Google**");
            }
        });
        mBigCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBigCheck.isChecked())
                    mResult.add("**Big**");
                else
                    mResult.remove("**Big**");
            }
        });
        mYahooCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mYahooCheck.isChecked())
                    mResult.add("**Yahoo**");
                else
                    mResult.remove("**Yahoo**");
            }
        });
        mWriteResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s: mResult) {
                    stringBuilder.append(s).append("\n");

                    mResultTextView.setText(stringBuilder.toString());
                    mResultTextView.setEnabled(false);
                }
            }
        });
    }
}

