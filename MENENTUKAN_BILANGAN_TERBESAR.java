package tugas1_kalkulator_java;
import java.util.Scanner;
public class MENENTUKAN_BILANGAN_TERBESAR {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int A, B;
        
        System.out.print("input A= ");
        A = scan.nextInt();
        System.out.print("input B= ");
        B = scan.nextInt();
        if (A>B)  System.out.println("BILANGAN TERBESAR="+A);
        else System.out.println("BILANGAN TERBESAR="+B);
    }

    
   
    
}
