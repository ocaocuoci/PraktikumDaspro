import java.util.Scanner;
public class PemilihanBilangan12{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.println("Masukkan sebuah angka: ");
        angka = input.nextInt();

        if ( angka % 2 == 0){
            System.out.println("Angkat" + angka  "adalah bilangan genap");
        }
        else {
            System.out.println("Angka" + angka + "adalah bilangan ganjil");
        }
    }
}