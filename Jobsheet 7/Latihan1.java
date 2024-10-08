import java.util.Scanner;
public class Latihan1{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int jam = 0, total = 0, hari =7, i = 1;
        while (i < hari) {
            System.out.print("Masukkan jam belajar hari ke-" + i + ": ");
            jam = input.nextInt();
            
            if (jam >= 10) {
                System.out.println("tidak mungkin");
                continue;
            } else {
                total += jam;
            }
            i++;
        } System.out.println("total belajar salama seminggu: " + total);
        input.close();
        

        
    }
}