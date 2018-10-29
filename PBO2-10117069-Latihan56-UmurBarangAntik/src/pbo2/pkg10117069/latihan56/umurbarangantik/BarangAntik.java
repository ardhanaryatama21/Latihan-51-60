/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Umur Barang Antik
 */
package pbo2.pkg10117069.latihan56.umurbarangantik;

public class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}
