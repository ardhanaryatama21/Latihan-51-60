/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Detective Conan
 */
package pbo2.pkg10117069.latihan59.detectiveconan;

public class Umur extends JenisKelamin {
    private int Usia;

    public Umur(String nama,int Usia,String jenisKelamin) {
        super(nama, jenisKelamin);
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
