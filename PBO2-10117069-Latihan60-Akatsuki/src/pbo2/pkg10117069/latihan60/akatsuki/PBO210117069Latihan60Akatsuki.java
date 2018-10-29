/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Akatsuki
 */
package pbo2.pkg10117069.latihan60.akatsuki;

public class PBO210117069Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==== Karakter Akatsuki Anime Naruto ====\n");
        Umur itachi = new Umur("Itachi Uchiha", 21, "Laki-laki");
        itachi.tampil();
        
        Umur konan = new Umur("Konan", 35, "Perempuan");
        konan.tampil();
        
        Umur tobi = new Umur("Obito Uchiha/Tobi", 31, "Laki-laki");
        tobi.tampil();
        
        System.out.println("Create by Muhammad Ardhan Aryatama");
    }
}
