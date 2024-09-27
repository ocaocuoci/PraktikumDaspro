import java.util.Scanner;
public class PemilihanHariDenganIf12{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

       
        System.out.print("Masukkan angka (1-7): ");
        int number = input.nextInt();

        if (number >= 1 && number <=5 ){
            System.out.print("weekday");
        }
        else if (number == 6 || number == 7){
            System.out.print("Weekend");
        }
        else{
            System.out.print("nomor tidak valid");
        }
    
    
    }
}