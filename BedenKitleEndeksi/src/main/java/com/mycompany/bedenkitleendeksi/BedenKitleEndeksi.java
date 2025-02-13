
package com.mycompany.bedenkitleendeksi;

import java.util.Scanner;


public class BedenKitleEndeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
                
        double boy = scanner.nextDouble();
        double kilo = scanner.nextDouble();
        
        System.out.println("vücut kitle endeksiniz: " + (kilo / boy) * boy );
        
    }
}
