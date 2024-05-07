package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class result extends AppCompatActivity {
    private List<Specs> specs;
    private TextView resultTextView;

    public void  getspecs() {
        specs = new ArrayList<>();
        specs.add(new Specs(1|0, 1|0, 1|0, 0));
        specs.add(new Specs(2|0, 2|0, 2|0, 1));
        specs.add(new Specs(3|0, 3|0, 3|0, 0));
        specs.add(new Specs(4|0, 4|0, 4|0, 2));
        specs.add(new Specs(5|0, 5|0, 5|0, 1));
        specs.add(new Specs(6|0, 6|0, 3|0, 4));
        specs.add(new Specs(7|0, 7|0, 6|0, 2));
        specs.add(new Specs(8|0, 8|0, 7|0, 4));
        specs.add(new Specs(9|0, 9|0, 8|0, 4));
        specs.add(new Specs(10|0, 10|0, 7|0, 4));
        specs.add(new Specs(11|0, 11|0, 9|0, 4));
        specs.add(new Specs(12|0, 12|0, 10|0, 4));
        specs.add(new Specs(13|0, 13|0, 11|0, 6));
        specs.add(new Specs(14|0, 14|0, 12|0, 6));
        specs.add(new Specs(15|0, 15|0, 13|0, 7));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);
        String selectedProcessor = getIntent().getStringExtra("processor");
        String selectedVideokart = getIntent().getStringExtra("graphicsCard");
        String selectedMatPlat = getIntent().getStringExtra("matplat");
        String selecteBlockPit = getIntent().getStringExtra("blockpit");
        getspecs();
        List<Specs> specc = new ArrayList<>();
        for(Specs spec: specs){
            if(spec.specss(selectedProcessor,selectedVideokart,selectedMatPlat,selecteBlockPit))
            {
                specc.add(spec);

            }
        }
        StringBuilder resultText = new StringBuilder();
        resultText.append(specc.get(0));
        resultTextView.setText(resultText.toString());


    }

    public void gotosett(View v) {
        startActivity(new Intent(result.this, Settings.class));
    }
    public void gotohom(View v) {
        startActivity(new Intent(result.this, Glavnaya.class));
    }
}