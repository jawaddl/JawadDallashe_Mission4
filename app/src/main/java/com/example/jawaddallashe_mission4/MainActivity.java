package com.example.jawaddallashe_mission4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    int count = 0;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setBackgroundColor(Color.RED);
        btn.setTextSize(30);
    }


    public void go(View view) {

        count++;
        String str = count + " ";
        btn.setText(str);
        btn.setText("This is a click number:" + count);
        btn.setTextSize(20);
        btn.setTextColor(Color.BLACK);
        if (count % 7 == 0) {
            btn.setText("BOOM !");

        }

    }
}