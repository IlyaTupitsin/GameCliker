package com.example.game;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String Timer;
    private Integer counter1 = 0;
    CountDownTimer timer;
    TextView mTimerText;
    private Integer counter2 = 0;
    private View v;
    SharedPreferences sPref;
    SharedPreferences sPref2;
    SharedPreferences sPref3;

    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";


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
                        TextView record1 = (TextView) findViewById(R.id.rekord1);
                        textView.setText("победил красный!");
                        record1.setText(counter1.toString());
                        saveText();
                    }
                    if (counter1 < counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил синий!");
                        TextView record1 = (TextView) findViewById(R.id.rekord1);
                        record1.setText(counter2.toString());
                        saveText();
                    }
                    if (counter1 == counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("ничья!");
                        TextView record1 = (TextView) findViewById(R.id.rekord1);
                        record1.setText(counter1.toString());
                        saveText();
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
                    if (counter1 > counter2) { // Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил красный!");
                        TextView record2 = (TextView) findViewById(R.id.rekord2);
                        record2.setText(counter1.toString());
                        saveText2();
                    }
                    if (counter1 < counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил синий!");
                        TextView record2 = (TextView) findViewById(R.id.rekord2);
                        record2.setText(counter2.toString());
                        saveText2();
                    }
                    if (counter1 == counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("ничья!");
                        TextView record2 = (TextView) findViewById(R.id.rekord2);
                        record2.setText(counter1.toString());
                        saveText2();
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
                        TextView record3 = (TextView) findViewById(R.id.rekord3);
                        record3.setText(counter1.toString());
                        saveText3();
                    }
                    if (counter1 < counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("победил синий!");
                        TextView record3 = (TextView) findViewById(R.id.rekord3);
                        record3.setText(counter2.toString());
                        saveText3();
                    }
                    if (counter1 == counter2) {// Инициализируем компонент
                        TextView textView = findViewById(R.id.textViewResultat);
                        // задаём текст
                        textView.setText("ничья!");
                        TextView record3 = (TextView) findViewById(R.id.rekord3);
                        record3.setText(counter1.toString());
                        saveText3();
                    }
                }
            }.start();
        }

    }

    private void saveText3() {
        TextView record3 = (TextView) findViewById(R.id.rekord3);
        sPref3 = getPreferences(MODE_PRIVATE);
        Editor ed3 = sPref3.edit();
        ed3.putString(SAVED_TEXT3, record3.getText().toString());
        ed3.commit();
        Toast.makeText(this, "Text saved3", Toast.LENGTH_SHORT).show();
    }

    private void saveText2() {
        TextView record2 = (TextView) findViewById(R.id.rekord2);
        sPref2 = getPreferences(MODE_PRIVATE);
        Editor ed2 = sPref2.edit();
        ed2.putString(SAVED_TEXT2, record2.getText().toString());
        ed2.commit();
        Toast.makeText(this, "Text saved2", Toast.LENGTH_SHORT).show();
    }

    private void saveText() {
        TextView record1 = (TextView) findViewById(R.id.rekord1);
        sPref = getPreferences(MODE_PRIVATE);
        Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, record1.getText().toString());
        ed.commit();
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    public void onClickBtnBack (View view){

        findViewById(R.id.buttonStart).setVisibility(View.VISIBLE);
        // finish();
        // startActivity(getIntent());
        // overridePendingTransition(0, 0);
        // String time = System.currentTimeMillis() + "";
        // v.setVisibility(View.VISIBLE);
        counter1 = 0;
        counter2 = 0;
        TextView counterView = findViewById(R.id.igrok1);
        counterView.setText(counter1.toString());
        counterView = findViewById(R.id.igrok2);
        counterView.setText(counter2.toString());
        TextView Resultat = (TextView) findViewById(R.id.textViewResultat);
        Resultat.setText("");



    }
    public void onClickLoad (View view){
        loadText();
        loadText2();
        loadText3();

    }

    private void loadText3() {
        TextView record3 = (TextView) findViewById(R.id.rekord3);
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText3 = sPref3.getString(SAVED_TEXT3, "");
        record3.setText(savedText3);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    private void loadText2() {
        TextView record2 = (TextView) findViewById(R.id.rekord2);
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText2 = sPref2.getString(SAVED_TEXT2, "");
        record2.setText(savedText2);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    private void loadText() {
        TextView record1 = (TextView) findViewById(R.id.rekord1);
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        record1.setText(savedText);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

}
