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

//        TextView firstText = (TextView)findViewById(R.id.firstText);
//        firstText.setTextSize(12);
//        firstText.setTextColor(R.color.colorPrimaryDark);
//        long result = calc_ruiJyo(20);
//        this.setTitle(String.valueOf(result));
//        firstText.setText(String.valueOf(result));
        Cat tama = new Cat("タマ", 3, "オス", "三毛猫");
        Cat poti = new Cat("ポチ", 1, "メス", "白猫");

        tama.say(tama.name + "は" + tama.gender + "だにゃ");
        poti.say(poti.name + "は" + poti.gender + "だにゃ");

        tama.sleep();
        poti.say("寝てるし…");
        poti.sleep();

    }

    private long calc_ruiJyo(int n) {
        long product = 1l;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
