/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Umur Barang Antik
 */
package pbo2.pkg10117069.latihan56.umurbarangantik;

public class PBO210117069Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio rad = new Radio(234);
        rad.setName("Radio AM");
        System.out.println("Nama barang Antik : " + rad.getName() );
        rad.tampilUmur();
    }  
}
