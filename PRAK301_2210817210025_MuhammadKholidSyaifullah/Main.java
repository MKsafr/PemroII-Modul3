package PRAK301_2210817210025_MuhammadKholidSyaifullah ;
import java.util.LinkedList ;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> dadu = new LinkedList<Integer>() ;
        Scanner masuk = new Scanner(System.in) ;
        Dadu isiDadu = new Dadu() ;
        int jumlah = masuk.nextInt() ;

        for(int i = 1; i <= jumlah; i++) {
            int acak = isiDadu.acakNilai() ;
            dadu.add(acak) ;
            System.out.println("Dadu ke-" + i + " bernilai " + acak) ;
        }

        int total = 0 ;

        for(int i : dadu) {
            total += i ;
        }

        System.out.println("Total nilai dadu keseluruhan " + total) ;
    }
}