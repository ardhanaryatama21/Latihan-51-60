/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Akatsuki
 */
package pbo2.pkg10117069.latihan60.akatsuki;

public class Umur extends JenisKelamin{
    private int Usia;

    public Umur(String nama, int Usia, String jenisKelamin) {
        super(jenisKelamin, nama);
        this.Usia = Usia;
    }

    public int getUsia() {
        return Usia;
    }
    
    public void tampil(){
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + getUsia() + " Tahun");
        System.out.println("Jenis Kelamin : " + getJenisKelamin() + "\n");
    }
    
}
