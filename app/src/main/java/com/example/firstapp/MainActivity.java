package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String message = "タイトル";
//        this.setTitle(message);
//        long product = 1l;
//        int product = 1;
//        for (int i = 1; i <= 20; i++) {
//            product = product * i;
//        }
//        this.setTitle(String.valueOf(product));

        TextView firstText = (TextView)findViewById(R.id.firstText);
//        firstText.setTextSize(12);
        firstText.setTextColor(R.color.colorPrimaryDark);
        long result = calc_ruiJyo(20);
//        this.setTitle(String.valueOf(result));
        firstText.setText(String.valueOf(result));
    }

    private long calc_ruiJyo(int n) {
        long product = 1l;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
