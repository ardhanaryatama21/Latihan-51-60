/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Vehicle
 */
package pbo2.pkg10117069.latihan57.vehicle;

public class Skateboard extends Vehicle{
    private double myBoardLeght;

    public Skateboard() {
        System.out.println("Skateboard");
    }

    public double getMyBoardLeght() {
        return myBoardLeght;
    }

    public void setMyBoardLeght(double myBoardLeght) {
        this.myBoardLeght = myBoardLeght;
    }
}
