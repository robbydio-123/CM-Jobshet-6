import java.util.Scanner;

public class ambon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Ratarata;
        String Nilaihuruf = "";
        String status = "-";
        double UTS, UTS2;
        double nilaiakhir1, nilaiakhir2, nilairatarata;
        
        System.out.println("    ===================================================================");
        System.out.println("    Data Mahasiswa Lulusan Jurursan Teknologi Informasi");
        System.out.println("    POLITEKNIK NEGERI MALANG PERIODE 2025/2026");
        System.out.println("    Pembobotan: Nilai Tugas 30%, Nilai UTS 30%, Nilai UAS 40%");
        System.out.println("    ===================================================================");   

       System.out.println("    ======================= INPUT DATA MAHASISWA ======================");
             String nama;
             System.out.print("     Masukan Nama: ");
             nama = scanner.nextLine();
             String nim;
             System.out.print("     Masukan NIM: ");
             nim = scanner.nextLine();
             System.out.println("     ==================================================================");

                 System.out.println("     ========= Mata Kuliah 1: Algoritma dan Pemrograman ===============");
                 System.out.print("     Masukan Nilai UTS: ");
                 UTS = scanner.nextDouble();
                 double UAS;
                 System.out.print("     Masukan Nilai UAS: ");
                 UAS = scanner.nextDouble();
                 double Tugas;
                 System.out.print("     Masukan Nilai Tugas: ");
                 Tugas = scanner.nextDouble();
                 System.out.println("     ==================================================================");


                      System.out.println("     ========= Mata Kuliah 2: Basis Data ==============================");
                      System.out.print("     Masukan Nilai UTS2: ");
                      UTS2 = scanner.nextDouble();
                      double UAS2;
                      System.out.print("     Masukan Nilai UAS2: ");
                      UAS2 = scanner.nextDouble();
                      double Tugas2;
                      System.out.print("     Masukan Nilai Tugas2: ");
                      Tugas2 = scanner.nextDouble();
                      System.out.println("     ==================================================================");
    }
}
