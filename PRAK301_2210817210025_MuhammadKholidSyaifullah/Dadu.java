package PRAK301_2210817210025_MuhammadKholidSyaifullah ;

public class Dadu {
    int nilai ;

    public int acakNilai() {
        nilai = 1 + (int)(Math.random() * 6) ;
        return nilai ;
    }
}
