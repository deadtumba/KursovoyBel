package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            SharedPreferences sp = getSharedPreferences("hasVisited",
                    Context.MODE_PRIVATE);
            // проверяем, первый ли раз открывается программа (Если вход первый то вернет false)
            boolean hasVisited = sp.getBoolean("hasVisited", false);

            if (!hasVisited) {
                // Сработает если Вход первый

                //Ставим метку что вход уже был
                SharedPreferences.Editor e = sp.edit();
                e.putBoolean("hasVisited", true);
                e.commit(); //После этого hasVisited будет уже true и будет означать, что вход уже был

                Button btndalee = (Button) findViewById(R.id.button);
                btndalee.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, guide1.class));
                    }
                });

            } else {
                startActivity(new Intent(MainActivity.this, Glavnaya.class));
            }
        }
    }


