package com.example.myapplication;

public class Specs {
    private int processor;
    private int videokarta;
    private int matplata;
    private int blocpit;
    public Specs(int processor, int videokarta, int matplata, int blocpit ) {
        this.processor = processor;
        this.videokarta = videokarta;
        this.matplata = matplata;
        this.blocpit = blocpit;
    }
    public int getProcessor() {
        return processor;
    }

    public int getvideokarta() {
        return videokarta;
    }

    public int getmatplata() {
        return matplata;
    }

    public int getblockpit() {
        return blocpit;
    }


    public boolean specss(int processor, int videokarta, int matplata, int blocpit) {
        int selectedprocessore = processor;
        int selectedvideokart = videokarta;
        int selectedmatplat = matplata;
        int selecteblockpit =  blocpit;

        return  selectedprocessore == processor &&
                selectedvideokart == videokarta &&
                selectedmatplat == matplata &&
                selecteblockpit == blocpit;
    }
}
