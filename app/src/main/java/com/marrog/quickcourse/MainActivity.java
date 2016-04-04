package com.marrog.quickcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button butGetResult;
    EditText editResult;
    TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butGetResult = (Button)findViewById(R.id.buttonGetResult);
        editResult = (EditText)findViewById(R.id.editText);
        textViewInfo = (TextView)findViewById(R.id.textViewInfo);

    }

    public void onClick(View v){
        editResult.setText("Test");
    }

}
