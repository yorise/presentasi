

package isas2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Siswa {
    String nama;
    int nilai, peringkat;
    
    Siswa(String nama, int nilai) {
        this.nama=nama;
        this.nilai=nilai;
    }
}

public class Isas2 {
    //Membuat program peringkat siswa dengan counting sort
    public static void peringkat(Siswa[] siswa){    //init array siswa
    //mengubah array siswa menjadi list    
    List<Integer> nilaiSiswa = new ArrayList<>();
    for (Siswa s : siswa) {
        nilaiSiswa.add(s.nilai);
    }
    // mencari nilai maksimum dari array siswa
    int max = Collections.max(nilaiSiswa);
    
    //membuat elemen array dengan array max sebelumnya + 1
    int[] count = new int [max + 1];
    //menghitung frekuensi setiap nilai di array siswa
    for (Siswa s : siswa) {
        count[s.nilai]++;
    }
    
    //mengubah count agar posisi terakhir sesuai dengan urutan
    for (int i = 1; i<=max; i++) {
        count[i] += count[i-1];
    }
    
    //array hasil
    Siswa[] urutSiswa = new Siswa[siswa.length];
    
    //mengisi array hasil dengan data siswa yang sudah diurutkan
    for (int i = siswa.length - 1; i >= 0; i--) {
        Siswa s = siswa[i];
        urutSiswa[siswa.length - count[s.nilai]] = s;   //mengurutkan nilai siswa secara menurun
        count[s.nilai]--;
    }
    
     // Menambahkan peringkat ke setiap siswa
        for (int i = 0; i < urutSiswa.length; i++) {
            urutSiswa[i].peringkat = i + 1;
        }
    
    //copy array yg sudah diurutkan kedalam array asli
    System.arraycopy(urutSiswa, 0, siswa, 0, siswa.length);
}
    

    public static void main(String[] args) {
        Siswa[] siswa = {
        new Siswa("Ayu",85),
        new Siswa("Agung", 55),
        new Siswa("Budi",80),
        new Siswa("Bella",70), 
        new Siswa("Husen",75),
        new Siswa("Soni",90),    
        new Siswa("Sinta",65),
        new Siswa("Tono",40),
        };
        
        System.out.println("Siswa Sebelum Diurutkan");
        for (Siswa s : siswa) {
            System.out.println(s.nama + " - " + s.nilai);
        }
        
        peringkat(siswa);
        
        System.out.println("");
        System.out.println("Siswa Setelah Diurutkan");
        for (Siswa s : siswa) {
            System.out.println(s.nama + " - " + s.nilai + " Ranking " + s.peringkat);
        }
    }    
}































