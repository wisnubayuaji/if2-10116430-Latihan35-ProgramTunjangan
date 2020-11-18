/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class App {
    public static void main(String[] args) throws Exception {
        double gajiPokok;
        String status;

        Tunjangan tj = new Tunjangan();
        Scanner scn = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajiPokok = scn.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) ? : ");
        status = scn.next();
        System.out.println();
        
        tj.doTunjangan(gajiPokok,status);
        System.out.println("Developed By : Wisnu Bayu Aji");
    }
}
