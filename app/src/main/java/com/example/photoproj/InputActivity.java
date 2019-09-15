package com.example.photoproj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alexander Klimov on 01.12.2014.
 */
public class InputActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_input);

        Button bInputName = findViewById(R.id.buttonInputName);             //кнопка вывода активити
        final TextInputEditText tietUserName = findViewById(R.id.TextInputEditText);    //поле ввода имени
        bInputName.setOnClickListener(new View.OnClickListener() {                      // реакция на нажатие кнопки
            @Override
            public void onClick(View view) {
                if(tietUserName.length() < 1) {     // если текста нет, выводим сообщение snackBar об этом
                    Snackbar.make(view, "Input some text", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } else {                            // если есть, переходим к следующему активити
                    Intent intent = new Intent(InputActivity.this, MainActivity.class);
                    MainActivity.setIsAuthentication(true);
                    startActivity(intent);
                }
            }
        });

        Button bClose = findViewById(R.id.buttonClose);             //кнопка вывода активити
        bClose.setOnClickListener(new View.OnClickListener() {                      // реакция на нажатие кнопки
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}