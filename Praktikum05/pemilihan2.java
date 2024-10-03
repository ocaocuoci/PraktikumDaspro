import java.util.Scanner;
public class pemilihan2{
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);

       int total, diskon, bayar;
       String kartu;

       System.out.print("Apakah pelanggan memiliki karatu (y atau t)?" );
       kartu = input.nextLine();
       System.out.print("Berapa total harga barang belanjaan? Rp ");
       total = input.nextInt();

       if (kartu.equals("y")) {
        if (total > 500000){
            diskon = 50000;
        } else {
            diskon = 25000;
        }
       } else {
        if (total > 200000){
            diskon = 10000;
        } else {
            diskon = 0;
        }
       }
       bayar = total - diskon;
       System.out.println("Total yang harus dibayarkan: Rp " + bayar);
    }
}