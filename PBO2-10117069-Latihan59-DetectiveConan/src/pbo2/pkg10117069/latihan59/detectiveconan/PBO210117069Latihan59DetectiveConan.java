/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Detective Conan
 */
package pbo2.pkg10117069.latihan59.detectiveconan;

public class PBO210117069Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==== Karakter Anime Conan ====\n");    
        Umur kogoro = new Umur("Kogoro Mouri",38 ,"Laki-laki");
        kogoro.tampil();

        Umur ayumi = new Umur("Ayumi Yoshida", 7, "Perempuan");
        ayumi.tampil();
    
        Umur conan = new Umur("Shinichi Kudo/Conan", 17, "Laki-laki");
        conan.tampil();
        
        System.out.println("Create by Muhammad Ardhan Aryatama");
    }   
}