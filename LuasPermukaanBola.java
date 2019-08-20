package tugas1_kalkulator_java;
import java.util.Scanner;
public class LuasPermukaanBola { 
public static void main(String[] args) 
        {
            System.out.print("Menghitung luas permukaan bola BY:RENDI\nSilahkan Masukkan jari-jari bola \n r= : ");
               System.err.println("RUMUSNYA ADALAH ==>JARI*JARI*22/7*4<==RUMUSNYA ADALAH");
                 Scanner input = new Scanner(System.in); 
               double jari = input.nextDouble();
            System.out.println("Luas Permukaan bola adalah " + jari*jari*3.14*4);
        }
    }
 