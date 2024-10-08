import java.util.Scanner;
public class Latihan2{
    public static void main(String [] args) {
        Scanner input =new Scanner(System.in);

        int pegawai, jam = 0;
        double bonus = 0.2, gajiHarian;
        
        pegawai = 1;
        do {
            System.out.println("Masukkan jam lebur pegawai ke-" + pegawai + ": ");
            jam = input.nextInt();
            if (jam >= 8 && jam <= 12){
                System.out.println("Masukkan gaji harian: ");
                gajiHarian = input.nextInt();
                double totalBonus = gajiHarian * bonus;
                System.out.println("bonus yang didapat pegawai " + totalBonus);
            } else if (jam > 0 && jam < 8) {
                System.out.println("Pegawai tersebut tidak diproses");
                continue;
            }
            pegawai++;

        } while (jam !=0);
        System.out.println("tidak valid");
        input.close(); 
        
    }
} 