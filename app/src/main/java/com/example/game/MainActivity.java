package com.example.game;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String Timer;
    private Integer counter1 = 0;
    CountDownTimer timer;
    TextView mTimerText;
    private Integer counter2 = 0;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //метод при которм при нажаитии на кнопку значение counter1 увеличивается на 1 и его счет пишется в текстовом поле idrok1
    public void onClickBtn4(View view) {
        counter1++;
        TextView counterView = findViewById(R.id.igrok1);
        counterView.setText(counter1.toString());

    }

    //метод при которм при нажаитии на кнопку значение counter2 увеличивается на 1 и его счет пишется в текстовом поле idrok2
    public void onClickBtn5(View view) {
        counter2++;
        TextView counterView = findViewById(R.id.igrok2);
        counterView.setText(counter2.toString());
    }




    public void onClickButton1(View view) {
        Timer = "10";
        counter1 =0;
        counter2 = 0;
        TextView counterView = findViewById(R.id.igrok1);
        counterView.setText(counter1.toString());
        counterView = findViewById(R.id.igrok2);
        counterView.setText(counter2.toString());

    }

    public void onClickButton2(View view) {
        Timer = "30";
        counter1 =0;
        counter2 = 0;
        TextView counterView = findViewById(R.id.igrok1);
        counterView.setText(counter1.toString());
        counterView = findViewById(R.id.igrok2);
        counterView.setText(counter2.toString());
    }

    //метод при катором при нажатии на кнопку, мы переходим на другую активность и с собой берём число
    public void onClickButton3(View view) {
        Timer = "60";
        counter1 =0;
        counter2 = 0;
        TextView counterView = findViewById(R.id.igrok1);
        counterView.setText(counter1.toString());
        counterView = findViewById(R.id.igrok2);
        counterView.setText(counter2.toString());
    }

    public void onClickStart(View v) {
        v.setVisibility(View.GONE);
        findViewById(R.id.button4).setEnabled(true);
        findViewById(R.id.button5).setEnabled(true);

        mTimerText = findViewById(R.id.textView);
        //условиe для выбора времени таймер
        if (Timer == "10") {
            //объявление таймера
            //объявление таймера на 10000 милисекунд или другими словами 10 секунд, второе число обозначает шаг таймера. В данном случае он равен 1000 милисекунлд или 1 секунде
            timer = new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long already) {
                    mTimerText.setText("" + already / 1000);
                }

                @Override
                public void onFinish() {
                    mTimerText.setText("");
                    findViewById(R.id.button4).setEnabled(false);
                    findViewById(R.id.button5).setEnabled(false);
                    //условия вывода результатов
                    if (counter1 > counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил красный!");
                    }
                    if (counter1 < counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил синий!");
                    }
                    if (counter1 == counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("ничья!");
                    }
                }

            }.start();
        }
        //условиe для выбора времени таймер
        if (Timer == "30") {
            //объявление таймера
            //объявление таймера на 30000 милисекунд или другими словами 30 секунд, второе число обозначает шаг таймера. В данном случае он равен 1000 милисекунлд или 1 секунде
            timer = new CountDownTimer(30000, 1000) {
                @Override
                public void onTick(long already) {
                    mTimerText.setText("" + already / 1000);
                }

                @Override
                public void onFinish() {
                    mTimerText.setText("");
                    findViewById(R.id.button4).setEnabled(false);
                    findViewById(R.id.button5).setEnabled(false);
                    //условия вывода результатов
                    if (counter1 > counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил красный!");
                    }
                    if (counter1 < counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил синий!");
                    }
                    if (counter1 == counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("ничья!");
                    }
                }
            }.start();
        }
        //условиe для выбора времени таймер
        if (Timer == "60") {
            //объявление таймера
            //объявление таймера на 60000 милисекунд или другими словами 60 секунд ну или 1 минуте, второе число обозначает шаг таймера. В данном случае он равен 1000 милисекунлд или 1 секунде
            timer = new CountDownTimer(60000, 1000) {
                @Override
                public void onTick(long already) {
                    mTimerText.setText("" + already / 1000);
                }

                @Override
                public void onFinish() {
                    mTimerText.setText("");
                    findViewById(R.id.button4).setEnabled(false);
                    findViewById(R.id.button5).setEnabled(false);
                    //условия вывода результатов
                    if (counter1 > counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил красный!");
                    }
                    if (counter1 < counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил синий!");
                    }
                    if (counter1 == counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("ничья!");
                    }
                }
            }.start();
        }

    }public void onClickBtnBack (View view){
        findViewById(R.id.buttonStart).setVisibility(View.VISIBLE);
       //finish();
        //startActivity(getIntent());
        //overridePendingTransition(0, 0);
        //String time = System.currentTimeMillis() + "";
        // v.setVisibility(View.VISIBLE);
        counter1 = 0;
        counter2 = 0;
        TextView counterView = findViewById(R.id.igrok1);
        counterView.setText(counter1.toString());
        counterView = findViewById(R.id.igrok2);
        counterView.setText(counter2.toString());

    }
}
