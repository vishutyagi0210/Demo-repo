package com.example.temp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences first = getSharedPreferences("logIN" , MODE_PRIVATE);
                Boolean check = first.getBoolean("flag",false);

                Intent inten;
                if(check){
                    inten = new Intent(SplashScreen.this , HomeActivity.class);
                }else{
                    inten = new Intent(SplashScreen.this , MainActivity.class);
                }
                startActivity(inten);
            }
        },3000);
    }
}