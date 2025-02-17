
package kosulludurumlar1;

import java.util.Scanner;


public class KosulluDurumlar1 {

   
    public static void main(String[] args) {
      /*
        if (koşul) {
           Koşul sağlanırsaa (True) bu blok çalışır.
        }
        else {
            Bu bloğun üstündeki herhangi bir koşul sağlanmazsa
              bu blok .alışır
        }
        */
    Scanner scanner = new Scanner(System.in);
      int sayı = scanner.nextInt();
      
        System.out.println("Lütfen bir sayı giriniz");
        
      if (sayı < 0) {
            System.out.println("Negatif");
           
        }
      else {
            System.out.println("Pozitif");
        }
      
      
    }
    
}
