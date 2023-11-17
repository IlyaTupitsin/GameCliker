package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {
    private Integer counter1 = 0;
    CountDownTimer timer;
    private Integer counter2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //первоночальное положение кнопок
        findViewById(R.id.button4).setEnabled(true);
        findViewById(R.id.button5).setEnabled(true);

    }

    //метод при которм при нажаитии на кнопку значение counter1 увеличивается на 1 и его счет пишется в текстовом поле idrok1
    public void onClickBtn4(View view) {
        counter1++;
        TextView counterView = findViewById(R.id.igrok1);
        counterView.setText(counter1.toString());
        Bundle arguments = getIntent().getExtras();
        int X = arguments.getInt("1");
//условиe для выбора времени таймер
        if (X == 10) {
            //объявление таймера
            timer = new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long l) {

                }

                @Override
                public void onFinish() {

                    findViewById(R.id.button4).setEnabled(false);
                    //условия вывода результатов
                    if(counter1 > counter2)
                    {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил красный!");
                    }
                    if(counter1 < counter2)
                    {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил синий!");
                    }
                    if(counter1 == counter2)
                    {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("ничья!");
                    }
                }


            }.start();
        }
        //условиe для выбора времени таймер
            if (X == 30) {
                //объявление таймера
                timer = new CountDownTimer(30000, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {

                        findViewById(R.id.button4).setEnabled(false);
                        //условия вывода результатов
                        if(counter1 > counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("победил красный!");
                        }
                        if(counter1 < counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("победил синий!");
                        }
                        if(counter1 == counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("ничья!");
                        }

                    }


                }.start();
            }
//условиe для выбора времени таймер
                if (X == 60) {
                    //объявление таймера
                    timer = new CountDownTimer(60000, 1000) {
                        @Override
                        public void onTick(long l) {

                        }

                        @Override
                        public void onFinish() {

                            findViewById(R.id.button4).setEnabled(false);
                            //условия вывода результатов
                            if(counter1 > counter2)
                            {// Инициализируем компонент
                                TextView textView = findViewById(R.id.textViewResultat);
                                // задаём текст
                                textView.setText("победил красный!");
                            }
                            if(counter1 < counter2)
                            {// Инициализируем компонент
                                TextView textView = findViewById(R.id.textViewResultat);
                                // задаём текст
                                textView.setText("победил синий!");
                            }
                            if(counter1 == counter2)
                            {// Инициализируем компонент
                                TextView textView = findViewById(R.id.textViewResultat);
                                // задаём текст
                                textView.setText("ничья!");
                            }

                        }


                    }.start();
            }

    }

    //метод при которм при нажаитии на кнопку значение counter2 увеличивается на 1 и его счет пишется в текстовом поле idrok2
        public void onClickBtn5 (View view)
        {
            counter2++;
            TextView counterView = findViewById(R.id.igrok2);
            counterView.setText(counter2.toString());

            Bundle arguments = getIntent().getExtras();
            int X = arguments.getInt("1");
//условиe для выбора времени таймер
            if (X == 10) {
//объявление таймера
                timer = new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {

                        findViewById(R.id.button5).setEnabled(false);
                        //условия вывода результатов
                        if(counter1 > counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("победил красный!");
                        }
                        if(counter1 < counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("победил синий!");
                        }
                        if(counter1 == counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("ничья!");
                        }
                    }


                }.start();


            }
//условиe для выбора времени таймер
            if (X == 30) {
                //объявление таймера
                timer = new CountDownTimer(30000, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {

                        findViewById(R.id.button5).setEnabled(false);
                        //условия вывода результатов
                        if(counter1 > counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("победил красный!");
                        }
                        if(counter1 < counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("победил синий!");
                        }
                        if(counter1 == counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("ничья!");
                        }
                    }


                }.start();


            }
            //условиe для выбора времени таймер
            if (X == 60) {
                //объявление таймера
                timer = new CountDownTimer(60000, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {

                        findViewById(R.id.button5).setEnabled(false);
                        //условия вывода результатов
                    if(counter1 > counter2)
                    {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил красный!");
                    }
                        if(counter1 < counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("победил синий!");
                        }
                        if(counter1 == counter2)
                        {// Инициализируем компонент
                            TextView textView = findViewById(R.id.textViewResultat);
                            // задаём текст
                            textView.setText("ничья!");
                        }
                    }


                }.start();


            }

        }
    }

