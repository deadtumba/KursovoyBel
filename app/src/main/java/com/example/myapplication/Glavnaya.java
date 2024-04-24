package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Glavnaya extends AppCompatActivity   {
    String[] cities = {"Moskva", "Samara", "Vologda", "Волгоград", "Саратов", "Воронеж"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_glavnaya);
    }

    public void gotohis(View v) {
        startActivity(new Intent(Glavnaya.this, history.class));
    }

    public void gotosett(View v) {
        startActivity(new Intent(Glavnaya.this, Settings.class));
    }
}



