

package com.mycompany.miniproje2;

import java.util.Scanner;


public class MiniProje2 {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Aracınızın km de kaç kuruş yaktığını giriniz: ");
        
        double kurus = scanner.nextDouble();
        
        System.out.println("Kaç km yol yaptığınızı girin: ");
        
        double km = scanner.nextDouble();
        
         System.out.println("Toplam Ödemeniz: " + kurus * km );
    }
}
