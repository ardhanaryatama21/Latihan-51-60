/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Siapa Kamu
 */
package pbo2.pkg10117069.latihan52.siapakamu;

public class PBO210117069Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dos = new Dosen();
        dos.setNama("Rizki Adam Kurniawan");
        dos.setNip("41227829930");
        dos.setUmur(27);
        dos.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : "+dos.getNip());
        dos.siapaKamu();
        dos.mengajarApa();
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Muhammad Ardhan Aryatama");
        mhs.setKelas("IF-2");
        mhs.setNim("10117069");
        mhs.setUmur(19);
        System.out.println("\nNIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
                
    }
    
}
