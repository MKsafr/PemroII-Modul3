package PRAK303_2210817210025_MuhammadKholidSyaifullah ;
import java.util.ArrayList ;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> dataMhs = new ArrayList<>() ;
        Scanner masuk = new Scanner(System.in) ;
        int pilihan ;

        do {
            System.out.println("\nMenu :") ;
            System.out.println("1. Tambah Mahasiswa") ;
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM") ;
            System.out.println("3. Cari Mahasiswa berdasarkan NIM") ;
            System.out.println("4. Tampilkan Daftar Mahasiswa") ;
            System.out.println("0. Keluar") ;
            System.out.print("Pilihan : ") ;

            pilihan = masuk.nextInt() ;
            masuk.nextLine() ;

            switch (pilihan) {
                case 1 :
                    System.out.print("Masukkan Nama Mahasiswa : ") ;
                    String namaMhs = masuk.nextLine() ;
                    System.out.print("Masukkan NIM Mahasiswa (harus unik) : ") ;
                    String nimMhs = masuk.nextLine() ;

                    boolean unik = true ;
                    for (Mahasiswa mhs : dataMhs) {
                        if (mhs.getNimMhs().equals(nimMhs)) {
                            unik = false ;
                            break ;
                        }
                    }

                    if (unik) {
                        Mahasiswa mhs = new Mahasiswa(namaMhs, nimMhs) ;
                        dataMhs.add(mhs) ;
                        System.out.println("Mahasiswa " + namaMhs + " ditambahkan.") ;
                    } 
                    else {
                        System.out.println("NIM HARUS UNIK.") ;
                    }
                    break ;

                case 2 :
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus : ") ;
                    String hapus = masuk.nextLine() ;

                    for (int i = 0; i < dataMhs.size(); i++) {
                        Mahasiswa mhs = dataMhs.get(i) ;

                        if (mhs.getNimMhs().equals(hapus)) {
                            dataMhs.remove(i) ;
                            System.out.println("Mahasiswa dengan NIM " + hapus + " dihapus.") ;
                            break ;
                        }
                    }
                    break ;

                case 3 :
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari : ") ;
                    String cari = masuk.nextLine() ;

                    for (Mahasiswa mhs : dataMhs) {
                        if (mhs.getNimMhs().equals(cari)) {
                            System.out.println("Nama : " + mhs.getNamaMhs()) ;
                            break ;
                        }
                    }
                    break ;

                case 4 :
                    System.out.println("Daftar Mahasiswa : ") ;

                    for (Mahasiswa mhs : dataMhs) {
                        System.out.println("NIM : " + mhs.getNimMhs() + ", Nama : " + mhs.getNamaMhs());
                    }
                    break;
            }
        }
        while (pilihan != 0) ;

        System.out.println("Terima Kasih!") ;
    }
}