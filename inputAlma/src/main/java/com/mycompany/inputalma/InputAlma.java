
package com.mycompany.inputalma;

import java.util.Scanner;


public class InputAlma {

    public static void main(String[] args) {
       
        Scanner scanner =  new Scanner(System.in);
        /*
        System.out.println("Lütfen Yazı Giriniz:");
        
       // int yas = scanner.nextInt();
        /*
       double sayi = scanner.nextDouble();
       
        System.out.println("Sayı: " + sayi);
        */
        /*
        String yazi = scanner.nextLine();
        
        System.out.println("Yazı: "+ yazi);
        */
        
        if (scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("Sayi: " + sayi);
        }
        else {
            System.out.println("Lutfen bir sayı giriniz...!");
            
        } 
   
    }
}
