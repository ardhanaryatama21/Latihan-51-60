/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Akatsuki
 */
package pbo2.pkg10117069.latihan60.akatsuki;

public class JenisKelamin extends Tokoh {
    private String jenisKelamin;

    public JenisKelamin(String jenisKelamin, String nama) {
        super(nama);
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
