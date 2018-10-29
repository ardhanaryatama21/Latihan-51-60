/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Gaji Karyawan
 */
package pbo2.pkg10117069.latihan51.gajikaryawan;

public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = kehadiran*10000;
    return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan (String jabatan){
        if(jabatan.equals("Manager")){
        tunjanganJabatan = 2000000;
        }else if(jabatan.equals("Kabag")){
        tunjanganJabatan = 1000000;
        }else
        tunjanganJabatan = 0;
        return tunjanganJabatan;
    }
    public float tunjanganGolongan(int golongan){
        if (golongan == 1){
        tunjanganGolongan=500000;
        }else if (golongan == 2){
        tunjanganGolongan=1000000;
        }else if (golongan == 3){
        tunjanganGolongan=1500000;
        }
        return tunjanganGolongan;
    }
    public float totalGaji(){
        return tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;
    }
}
