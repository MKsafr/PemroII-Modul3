package PRAK302_2210817210025_MuhammadKholidSyaifullah;
import java.util.LinkedList ;
import java.util.HashMap ;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        LinkedList<Negara> identitas = new LinkedList<>() ;
        Scanner masuk = new Scanner(System.in) ;

        HashMap<Integer, String> namaBulan = new HashMap<>() ;
        namaBulan.put(1, "Januari") ;
        namaBulan.put(2, "Februari") ;
        namaBulan.put(3, "Maret") ;
        namaBulan.put(4, "April") ;
        namaBulan.put(5, "Mei") ;
        namaBulan.put(6, "Juni") ;
        namaBulan.put(7, "Juli") ;
        namaBulan.put(8, "Agustus") ;
        namaBulan.put(9, "September") ;
        namaBulan.put(10, "Oktober") ;
        namaBulan.put(11, "November") ;
        namaBulan.put(12, "Desember") ;

        int jumlah = masuk.nextInt() ;
        
        for(int i = 0; i < jumlah; i++) {
            masuk.nextLine() ;
            String namaNegara = masuk.nextLine() ;
            String jenisKepemimpinan = masuk.nextLine() ;
            String namaPemimpin = masuk.nextLine() ;
            int tglMerdeka, bulanMerdeka, tahunMerdeka ;

            if(!jenisKepemimpinan.equals("monarki")) {
                tglMerdeka = masuk.nextInt() ;
                bulanMerdeka = masuk.nextInt() ;
                tahunMerdeka = masuk.nextInt() ;
            }
            else {
                tglMerdeka = 0 ;
                bulanMerdeka = 0 ;
                tahunMerdeka = 0 ;
            }

            Negara profil = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tglMerdeka, bulanMerdeka, tahunMerdeka) ;
            identitas.add(profil) ;
        }

        for(Negara profil : identitas) {
            String jenisKepemimpinan = profil.getJenisKepemimpinan() ;
            if (jenisKepemimpinan.equals("monarki")) {
                System.out.println("Negara " + profil.getNamaNegara() + " mempunyai Raja bernama " + profil.getNamaPemimpin() + "\n");
            }
            else {
                int bulanMerdeka = profil.getBulanMerdeka() ;
                String bulan = namaBulan.get(bulanMerdeka) ;
                System.out.println("Negara " + profil.getNamaNegara() + " mempunyai " + jenisKepemimpinan + " bernama " + profil.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + profil.getTglMerdeka() + " " + bulan + " " + profil.getTahunMerdeka() + "\n");
            }
        }
    }
}