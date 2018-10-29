/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Handphone
 */
package pbo2.pkg10117069.latihan55.handphone;

public class PBO210117069Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android and = new Android("Xiaomi", "Android", "Grand", 3000000);
        and.setKeyStore("234ibfd3840fo");
        and.displayProduct();
        System.out.println("Android KeyStore : " + and.getKeyStore() + "\n");
        Blackberry bb = new Blackberry("Blackberry", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB() + "\n");
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : " + wp.getWpKeyStore());
    }   
}
