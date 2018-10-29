/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Rabbit
 */
package pbo2.pkg10117069.latihan53.rabbit;

public class Rabbit extends Animal{
    private String color;
    private String name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
    super(veg, food, legs);
    this.name = name;
    this.vegetarian = veg;
    this.eats = food;
    this.noofLegs = legs;
    this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
