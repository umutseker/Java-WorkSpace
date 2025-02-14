
package com.mycompany.miniproje3;

import java.util.Scanner;



public class MiniProje3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen bir Sayı girin: ");
        
        int a = scanner.nextInt();
       
        System.out.println("Lütfen bir sayı girin: ");
        
        int b = scanner.nextInt();
        
        int c = 0 ;
        c = a;
        a = b;
        b = c;
        System.out.println("değişen sayılar a:" + a + "b:" + b );
        
        
        
        
        
    }
}
