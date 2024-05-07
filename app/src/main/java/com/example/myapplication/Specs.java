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


    public boolean specss(String processor, String videokarta, String matplata, String blocpit) {
        int selectedprocessore = getProcess(processor);
        int selectedvideokart = getvideok(videokarta);
        int selectedmatplat = getmat(matplata);
        int selecteblockpit =  getblock(blocpit);

        return  selectedprocessore == Integer.parseInt(processor) &&
                selectedvideokart == Integer.parseInt(videokarta) &&
                selectedmatplat == Integer.parseInt(matplata) &&
                selecteblockpit == Integer.parseInt(blocpit);
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
}
