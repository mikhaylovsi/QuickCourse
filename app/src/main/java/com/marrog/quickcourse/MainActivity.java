package com.marrog.quickcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        new NewThread();

       count(1);

    }

    public  void count(int threadNum){

        try {

            synchronized (this){
            for (int i = 100; i > 0; i--) {

                System.out.println("Поток " + threadNum + " сделал " + i);
                Thread.sleep(200);

            }
        }
        }catch (Exception e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("поток " + threadNum + " завершен");


    }


    public void onClick(View v){

    }

    class NewThread extends Thread{



        NewThread() {
            super("Второй поток");
            System.out.println("Создан второй поток " + this);
            start();
        }


        @Override
        public void run() {

            count(2);

        }
    }

}
