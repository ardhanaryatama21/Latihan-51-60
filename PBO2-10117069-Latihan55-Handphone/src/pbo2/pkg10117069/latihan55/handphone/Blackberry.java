/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Handphone
 */
package pbo2.pkg10117069.latihan55.handphone;

public class Blackberry extends Handphone{
    private String pinBB;

    public Blackberry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    } 
}
