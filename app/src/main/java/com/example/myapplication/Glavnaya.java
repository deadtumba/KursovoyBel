package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Glavnaya extends AppCompatActivity   {
    private Spinner processorSpinner, videokartaSpinner, matplatSpinner;
    Button Podobrat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_glavnaya);
        processorSpinner = findViewById(R.id.processorSpinner);
        videokartaSpinner = findViewById(R.id.videokartaSpinner);
        matplatSpinner = findViewById(R.id.matplatSpinner);
        Podobrat = findViewById(R.id.Podobrat);
        setupSpinners();
        Podobrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Проверяем, выбраны ли все параметры комплектующих
                if (processorSpinner.getSelectedItemPosition() == 0 ||
                        videokartaSpinner.getSelectedItemPosition() == 0 ||
                        matplatSpinner.getSelectedItemPosition() == 0){

                    // Если не выбраны, выводим сообщение и не переходим на новое активити
                    Toast.makeText(game_selection.this, "Выберите комплектующие!", Toast.LENGTH_SHORT).show();
                } else {
                    // Если все параметры выбраны, создаем интент и передаем данные в новое активити
                    Intent intent = new Intent(game_selection.this, ResultActivity.class);
                    intent.putExtra("processor", processorSpinner.getSelectedItem().toString());
                    intent.putExtra("graphicsCard", videokartaSpinner.getSelectedItem().toString());
                    intent.putExtra("ram", matplatSpinner.getSelectedItem().toString());
                    startActivity(intent);
                }
            }
        });
    }
    private void setupSpinners() {
        ArrayAdapter<CharSequence> processorAdapter = ArrayAdapter.createFromResource(this,
                R.array.processors_array, android.R.layout.simple_spinner_item);
        processorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        processorSpinner.setAdapter(processorAdapter);

        ArrayAdapter<CharSequence> graphicsCardAdapter = ArrayAdapter.createFromResource(this,
                R.array.videokarta_array, android.R.layout.simple_spinner_item);
        graphicsCardAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        videokartaSpinner.setAdapter(graphicsCardAdapter);

        ArrayAdapter<CharSequence> ramAdapter = ArrayAdapter.createFromResource(this,
                R.array.Mat_Plat_array, android.R.layout.simple_spinner_item);
        ramAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        matplatSpinner.setAdapter(ramAdapter);

    }

    public void gotohis(View v) {
        startActivity(new Intent(Glavnaya.this, history.class));
    }

    public void gotosett(View v) {
        startActivity(new Intent(Glavnaya.this, Settings.class));
    }



}



