package PRAK302_2210817210025_MuhammadKholidSyaifullah;

public class Negara {
    String namaNegara ;
    String jenisKepemimpinan ;
    String namaPemimpin ;
    int tglMerdeka ;
    int bulanMerdeka ;
    int tahunMerdeka ;

    public Negara(String namaNegara, String jenisKepemimpinan, String namaPemimpin, int tglMerdeka, int bulanMerdeka, int tahunMerdeka) {
        this.namaNegara = namaNegara ;
        this.jenisKepemimpinan = jenisKepemimpinan ;
        this.namaPemimpin = namaPemimpin;
        this.tglMerdeka = tglMerdeka ;
        this.bulanMerdeka = bulanMerdeka ;
        this.tahunMerdeka = tahunMerdeka ;
    }

    public String getNamaNegara() {
        return namaNegara ;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan ;
    }
    
    public String getNamaPemimpin() {
        return namaPemimpin ;
    }
    
    public int getTglMerdeka() {
        return tglMerdeka ;
    }
    
    public int getBulanMerdeka() {
        return bulanMerdeka ;
    }
    
    public int getTahunMerdeka() {
        return tahunMerdeka ;
    }
}
