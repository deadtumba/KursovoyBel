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
    private TextView resultTextView2;

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
        int selectedprocessore = getProcess(selectedProcessor);
        int selectedvideokart = getvideok(selectedVideokart);
        int selectedmatplat = getmat(selectedMatPlat);
        int selecteblockpit =  getblock(selecteBlockPit);
        StringBuilder resultText = new StringBuilder();
        for(Specs spec: specs){
            if(spec.specss(selectedprocessore,selectedvideokart,selectedmatplat,selecteblockpit))
            {
                specc.add(spec);

            }
        }
        resultTextView2 = findViewById(R.id.resultTextView2);




    }
    public int getProcess(String processor) {
        switch (processor) {
            case "AMD Ryzen 3 3200G":
                return 1;
            case "Intel Core i3-9100F":
                return 2;
            case "AMD Ryzen 5 3400G":
                return 3;
            case "Intel Core i5-9400F":
                return 4;
            case "AMD Ryzen 3 3300X":
                return 5;
            case "AMD Ryzen 5 3600":
                return 6;
            case "Intel Core i5-10400F":
                return 7;
            case "AMD Ryzen 7 3700X":
                return 8;
            case "Intel Core i7-9700K":
                return 9;
            case "AMD Ryzen 5 5600X":
                return 10;
            case "Intel Core i7-10700K":
                return 11;
            case "AMD Ryzen 9 5900X":
                return 12;
            case "Intel Core i9-10900K":
                return 13;
            case "AMD Ryzen 9 5950X":
                return 14;
            case "Intel Core i9-11900K":
                return 15;
            default:
                return 0;
        }
    }

    public int getvideok(String videok) {
        switch (videok) {
            case "NVIDIA GeForce GT 1030":
                return 1;
            case "AMD Radeon RX 570":
                return 2;
            case "NVIDIA GeForce GTX 1650":
                return 3;
            case "AMD Radeon RX 580":
                return 4;
            case "NVIDIA GeForce GTX 1660":
                return 5;
            case "NVIDIA GeForce RTX 2060":
                return 6;
            case "AMD Radeon RX 5600 XT":
                return 7;
            case "NVIDIA GeForce RTX 2070 Super":
                return 8;
            case "AMD Radeon RX 5700 XT":
                return 9;
            case "NVIDIA GeForce RTX 3060 Ti":
                return 10;
            case "NVIDIA GeForce RTX 3070":
                return 11;
            case "NVIDIA GeForce RTX 3080":
                return 12;
            case "AMD Radeon RX 6900 XT":
                return 13;
            case "NVIDIA GeForce RTX 3090":
                return 14;
            case "NVIDIA GeForce RTX 4090":
                return 15;
            default:
                return 0;
        }
    }

    public int getmat(String MatPlat) {
        switch (MatPlat) {
            case "Материнская плата Gigabyte GA-A320M-H mATX AM4":
                return 1;
            case "Материнская плата Gigabyte H310M S2H 1151v2":
                return 2;
            case "Материнская плата MSI B450M MORTAR MAX mATX AM4":
                return 3;
            case "Материнская плата MSI Z370-A PRO 1151v2":
                return 4;
            case "Материнская плата ASRock X370 Pro4 AM4":
                return 5;
            case "Материнская плата ASRock H410M-HVS mATX LGA1200":
                return 6;
            case "Материнская плата Gigabyte B550 AORUS ELITE AM4":
                return 7;
            case "Материнская плата MSI Z390-A PRO 1151v2":
                return 8;
            case "Материнская плата MSI Z490-A PRO LGA1200":
                return 9;
            case "Материнская плата MSI MEG X570 UNIFY AM4":
                return 10;
            case "Материнская плата MSI MPG Z490 GAMING CARBON WIFI LGA1200":
                return 11;
            case "Материнская плата MSI MAG X570 TOMAHAWK WIFI AM4":
                return 12;
            case "Материнская плата ASRock Z490 EXTREME4 LGA1200":
                return 13;
            default:
                return 0;
        }
    }
    public int getblock(String blockpit) {
        switch (blockpit) {
            case "300W":
                return 1;
            case "400W":
                return 2;
            case "450W":
                return 3;
            case "500W":
                return 4;
            case "600W":
                return 5;
            case "700W":
                return 6;
            case "750W":
                return 7;
            case "850W":
                return 8;
            case "900W":
                return 9;
            default:
                return 0;
        }
    }

    public void gotosett(View v) {
        startActivity(new Intent(result.this, Settings.class));
    }
    public void gotohom(View v) {
        startActivity(new Intent(result.this, Glavnaya.class));
    }
}