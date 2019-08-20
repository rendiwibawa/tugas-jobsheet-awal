package javaapplication17;

import java.util.Scanner;
public class MenghitungLuasSegitiga {
    public static void main(String[] args) {
       System.out.println("cara menghitung luas segitiga\n ++++by:rendi++++");
     int luas;
      
         System.out.print("silahkan masukan alas     =");
         Scanner y= new Scanner(System.in);
           int alas= y.nextInt();
         System.out.print("silahkan masukan tinggi   =");
           int tinggi= y.nextInt();
           luas=(int) (alas*tinggi*0.5);
         System.out.println("jadi luas segitiga ="  +luas);
    
    }  
}
