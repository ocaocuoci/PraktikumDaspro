import java.util.Scanner;
public class Siakad12{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String nama, nilaiHuruf, nim;
        double nilaiAkhir, nilaiUjian, nilaiTugas, nilaiKuiz;
        int nomorAbsen;
        char kelas;
        

        System.out.println ("-- Check Kelulusan Mahasiswa--");

        System.out.print("Masukan nama anda: ");
        nama = input.nextLine();

        System.out.print("Masukan NIM: ");
        nim = input.nextLine();

        System.out.print("Masukan nomor absen: ");
        nomorAbsen = input.nextInt();
        System.out.print("Masukan kelas: ");
        kelas = input.next().charAt(0);

        System.out.print("Masukan nilai Kuis: ");
        nilaiKuiz = input.nextDouble();
        System.out.print("Masukan nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukan nilai Ujian: ");
        nilaiUjian = input.nextDouble();

        nilaiAkhir = (nilaiKuiz + nilaiUjian + nilaiTugas) / 3;

        System.out.println("Mahasiswa dengan nama" + nama + "NIM" + nim + "kelas" + kelas + "nomor absen" + nomorAbsen);

        System.out.print("Nilai Kahir:" + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73){
            nilaiHuruf = "B+";
        }
         else if (nilaiAkhir > 65){
            nilaiHuruf = "B";
        }
         else if (nilaiAkhir > 60){
            nilaiHuruf = "C+";
        }
         else if (nilaiAkhir > 50){
            nilaiHuruf = "C";
        }
         else if (nilaiAkhir > 39){
            nilaiHuruf = "D";
        }
        else {
            nilaiHuruf = "E";
        }
        switch (nilaiHuruf) {
            case "A":
            System.out.println("Nilai Akhir Huruf: A");
            System.out.println("Kualifikasi: sangat baik"); 
                break;
            case "B+":
            System.out.println("Nilai Akhir Huruf: B+");
            System.out.println("Kualifikasi: lebih baik"); 
                break;
            case "B":
            System.out.println("Nilai Akhir Huruf: B");
            System.out.println("Kualifikasi: baik"); 
                break;
            case "C+":
            System.out.println("Nilai Akhir Huruf: C+");
            System.out.println("Kualifikasi: lebih dari cukup"); 
                break;
            case "C":
            System.out.println("Nilai Akhir Huruf: C");
            System.out.println("Kualifikasi: cukup"); 
                break;
            case "D":
            System.out.println("Nilai Akhir Huruf: D");
            System.out.println("Kualifikasi: kurang"); 
                break;
            case "E":
            System.out.println("Nilai Akhir Huruf: E");
            System.out.println("Kualifikasi: Gagal"); 
                break;
   
        }

        input.close();

        
    }
}