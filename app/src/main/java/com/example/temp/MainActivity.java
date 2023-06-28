package com.example.temp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences first = getSharedPreferences("logIN" , MODE_PRIVATE);
                SharedPreferences.Editor  edit = first.edit();
                edit.putBoolean("flag" , true);
                edit.apply();

                Intent inten = new Intent(MainActivity.this , HomeActivity.class);
                startActivity(inten);
            }
        });

    }
}