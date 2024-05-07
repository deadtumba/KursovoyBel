package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Glavnaya extends AppCompatActivity   {
    private Spinner processorSpinner, videokartaSpinner, matplatSpinner, blockpitSpinner;
    Button Podobrat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_glavnaya);
        processorSpinner = findViewById(R.id.processorSpinner);
        videokartaSpinner = findViewById(R.id.videokartaSpinner);
        matplatSpinner = findViewById(R.id.matplatSpinner);
        blockpitSpinner = findViewById(R.id.blockpitSpinner);
        Podobrat = findViewById(R.id.Podobrat);
        Spinners();
        Podobrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (processorSpinner.getSelectedItemPosition() == 0 &&
                        videokartaSpinner.getSelectedItemPosition() == 0 &&
                        matplatSpinner.getSelectedItemPosition() == 0 &&
                        blockpitSpinner.getSelectedItemPosition() == 0){
                    Toast.makeText(Glavnaya.this, "Выберите хоть что-нибудь!!!", Toast.LENGTH_SHORT).show();
                } else {
                         Intent intent = new Intent(Glavnaya.this, result.class);
                    intent.putExtra("processor", processorSpinner.getSelectedItem().toString());
                    intent.putExtra("graphicsCard", videokartaSpinner.getSelectedItem().toString());
                    intent.putExtra("matplat", matplatSpinner.getSelectedItem().toString());
                    intent.putExtra("blockpit", blockpitSpinner.getSelectedItem().toString());
                    startActivity(intent);
                }
            }
        });
    }
    private void Spinners() {
        ArrayAdapter<CharSequence> processorAdapter = ArrayAdapter.createFromResource(this,
                R.array.processors_array, android.R.layout.simple_spinner_item);
        processorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        processorSpinner.setAdapter(processorAdapter);

        ArrayAdapter<CharSequence> vieokartaapt = ArrayAdapter.createFromResource(this,
                R.array.videokarta_array, android.R.layout.simple_spinner_item);
        vieokartaapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        videokartaSpinner.setAdapter(vieokartaapt);

        ArrayAdapter<CharSequence> ramAdapter = ArrayAdapter.createFromResource(this,
                R.array.Mat_Plat_array, android.R.layout.simple_spinner_item);
        ramAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        matplatSpinner.setAdapter(ramAdapter);
        ArrayAdapter<CharSequence>  blockpitadap = ArrayAdapter.createFromResource(this,
                R.array.Block_Pitan_array, android.R.layout.simple_spinner_item);
        blockpitadap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        blockpitSpinner.setAdapter(blockpitadap);

    }

    public void gotosett(View v) {
        startActivity(new Intent(Glavnaya.this, Settings.class));
    }



}



