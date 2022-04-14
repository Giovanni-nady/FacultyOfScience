package com.example.facultyofscience;

import static com.example.facultyofscience.R.layout.splash_screen;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.example.facultyofscience.MainActivity;

public class Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread thread=new Thread(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            public void run(){

                try {
                    sleep(4000);
                    finish();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(Screen.this, MainActivity.class);
                    startActivity(intent);
                }
            }

        };thread.start();

    }
}