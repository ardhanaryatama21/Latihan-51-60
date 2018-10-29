/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Rabbit
 */
package pbo2.pkg10117069.latihan53.rabbit;

public class PBO210117069Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rab = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, his name is " + rab.getName());
        System.out.println(rab.getName() + " is Vegetarian? " + rab.isVegetarian());
        System.out.println(rab.getName() + " eats " + rab.getEats());
        System.out.println(rab.getName() + " has " + rab.getNoofLegs() + " legs.");
        System.out.println(rab.getName() + " color is " + rab.getColor());
    }
}
