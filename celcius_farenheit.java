package javaapplication17;
import java.util.Scanner;
public class celcius_farenheit {
public static void main(String[] args) {
    Scanner ren=new Scanner(System.in);
        double hasil,celcius;
    System.out.println("SILAHKAN MASUKAN SUHU CELCIUS YANG AKAN KALIAN UBAH MENJADI FARENHEIT ");
    System.out.print("di sini =");
        celcius=ren.nextDouble();
        hasil=celcius*9/5+32;
   
    System.out.println("Rumusnya adalah(suhu celcius*9/5)+32\nSELESAI!!!");
   System.out.println("hasil dari celcius ke farenheit adalah="+hasil);
}
}