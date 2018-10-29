/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Vehicle
 */
package pbo2.pkg10117069.latihan57.vehicle;

public class PBO210117069Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bic = new Bicycle();
        bic.setBrand("Trek Bike");
        bic.setModel("7.4FX");
        bic.setGearCount(23);
        System.out.println("Brand : " + bic.getBrand());
        System.out.println("Model : " + bic.getModel());
        System.out.println("Jumlah Gear : " + bic.getGearCount() + "\n");
        Skateboard ska = new Skateboard();
        ska.setBrand("Ally Skate");
        ska.setModel("Rocket");
        ska.setMyBoardLeght(54.5);
        System.out.println("Brand : " + ska.getBrand());
        System.out.println("Model : " + ska.getModel());
        System.out.println("Panjangnya Board : " + ska.getMyBoardLeght());
    }
}
