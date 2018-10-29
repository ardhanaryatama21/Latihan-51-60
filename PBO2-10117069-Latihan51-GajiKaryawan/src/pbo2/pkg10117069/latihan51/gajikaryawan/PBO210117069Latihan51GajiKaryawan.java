/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Gaji Karyawan
 */
package pbo2.pkg10117069.latihan51.gajikaryawan;

import java.util.Scanner;

public class PBO210117069Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Manager mgr = new Manager();
        System.out.println("==== Program Perhitungan Gaji Karyawan ====");
        System.out.print("Masukkan NIk : ");
        mgr.setNik(scan.nextLine());
        System.out.print("Masukkan Nama : ");
        mgr.setNama(scan.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mgr.setGolongan(scan.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mgr.setJabatan(scan.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mgr.setKehadiran(scan.nextInt());
        System.out.println("\n==== Hasil Perhitungan ====");
        System.out.println("NIK : "+mgr.getNik());
        System.out.println("Nama : "+mgr.getNama());
        System.out.println("Golongan : "+mgr.getGolongan());
        System.out.println("Jabatan : "+mgr.getJabatan());
        System.out.println("\nTunjangan Golongan : "+mgr.tunjanganGolongan(mgr.getGolongan()));
        System.out.println("Tunjangan Jabatan : "+mgr.tunjanganJabatan(mgr.getJabatan()));
        System.out.println("Tunjangan Kehadiran : "+mgr.tunjanganKehadiran(mgr.getKehadiran()));
        System.out.println("\nGaji Total : "+mgr.totalGaji());
    }
    
}
