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
    
                         nilaiakhir1 = (UTS*0.3 + UAS*0.4 + Tugas*0.3) ;
                        nilaiakhir2 = (UTS2*0.3 + UAS2*0.4 + Tugas2*0.3) ;
                        Ratarata = (nilaiakhir1 + nilaiakhir2) / 2;

                        if(Ratarata >=80 && Ratarata<= 100){
                            Nilaihuruf = "A";
                            status = "Lulus";
                        } else if (Ratarata >=73 && Ratarata<= 80){
                            Nilaihuruf = "B+";
                            status = "Lulus";
                        } else if (Ratarata >=65 && Ratarata<= 73){
                            Nilaihuruf = "B";
                            status = "Lulus";   
                        } else if (Ratarata >=60 && Ratarata<= 65){
                            Nilaihuruf = "C+";
                            status = "Tidak Lulus";
                        } else if (Ratarata >=50 && Ratarata<= 60){
                            Nilaihuruf = "C";
                            status = "Tidak Lulus";
                        } else if (Ratarata >=39 && Ratarata<= 50){
                            Nilaihuruf = "D";
                            status = "Tidak Lulus"; 
                        } else if (Ratarata >=0 && Ratarata<= 39){
                            Nilaihuruf = "E";
                            status = "Tidak Lulus";
                        }

                        System.out.println("     ======================= Hasil Penilain Akademik ==================");
                        System.out.println("     Nama Mahasiswa: " + nama);
                        System.out.println("     NIM Mahasiswa: " + nim);
                        System.out.println("     ==================================================================");

                        System.out.println("     Mata Kuliah\t\tNilai UTS\tNilai UAS\tNilai Tugas\tNilai akhir\tNilaihuruf\tStatus");
                        System.out.println("     ================================================================================================================");
                        System.out.println("     Algoritma dan pemograman : " + UTS + "\t\t" + UAS + "\t\t" + Tugas + "\t\t" + nilaiakhir1 + "\t\t\t" + Nilaihuruf + "\t" + status);
                        System.out.println("     Basis Data               : " + UTS2 + "\t\t" + UAS2 + "\t\t" + Tugas2 + "\t\t" + nilaiakhir2 + "\t\t\t" + Nilaihuruf + "\t" + status);
                        System.out.println("     Rata-rata Nilai Akhir    : " + nilaiakhir1);
                        System.out.println("     Status semester          : " + status);
                        System.out.println("     ===============================================================================================================");
                    }

                }


