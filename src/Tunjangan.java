/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 public class Tunjangan {
    public double tunjangan;
    public double totalGaji;
    
    public void doTunjangan(Double gajiPokok, String status) {
        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok/t/t: " + gajiPokok);

        //tunjangan
        tunjangan = (status.equals("Menikah")) ? 0.35 * gajiPokok : 0;

        System.out.println("Tunjangan : Rp. " + tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji : Rp. " + totalGaji);
    }
}