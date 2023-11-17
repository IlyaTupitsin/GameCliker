package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

String TimerMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    //метод при катором при нажатии на кнопку, мы переходим на другую активность и с собой берём число
    public void onClickButton1(View view)
    {
Intent intent = new Intent(this, gameActivity.class);
        intent.putExtra(TimerMode,10);
startActivity(intent);

    }
    //метод при катором при нажатии на кнопку, мы переходим на другую активность и с собой берём число
    public void onClickButton2(View view)
    {
        Intent intent = new Intent(this, gameActivity.class);
        intent.putExtra(TimerMode, 30);
        startActivity(intent);

    }
    //метод при катором при нажатии на кнопку, мы переходим на другую активность и с собой берём число
    public void onClickButton3(View view)
    {
        Intent intent = new Intent(this, gameActivity.class);

        intent.putExtra(TimerMode, 60);
        startActivity(intent);


    }
}