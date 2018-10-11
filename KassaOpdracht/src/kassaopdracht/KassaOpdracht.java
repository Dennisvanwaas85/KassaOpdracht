/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kassaopdracht;


import java.util.Scanner;

/**
 *
 * @author L.A , D.W Nummer 09 van de klas
 */
public class KassaOpdracht {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {

        
               
       boolean winkelen = true;
       int productNummer;
       int aantalProduct;
       int countPizza = 0;
       int countPatat = 0;  
       int countSnoep = 0;
       int countKaas = 0;
       int countBier = 0;
       int countFruit = 0;
       double [] prijzen = new double [7];
        prijzen [1] = 8.0;
        prijzen [2] = 2.10;
        prijzen [3] = 3.50;
        prijzen [4] = 1.50;
        prijzen [5] = 2.80;
        prijzen [6] = 4.00;
        
       String [] producten = new String [7];
        producten [1] = " Pizza";
        producten [2] = " Patat";
        producten [3] = " Snoep";
        producten [4] = " Kaas";
        producten [5] = " Bier";
        producten [6] = " Fruit";
        
                

               

             
       
               
       
       
       Scanner keyboard = new Scanner(System.in);
       
       while (winkelen == true){
          
       
           System.out.println("Kies een product of wil je afrekenen, dit doe je door het nummer in te vullen en dan enter te klikken");
           System.out.println("1  |" + producten[1]);
           System.out.println("2  |" + producten[2]);
           System.out.println("3  |" + producten[3]);
           System.out.println("4  |" + producten[4]);
           System.out.println("5  |" + producten[5]);
           System.out.println("6  |" + producten[6]);
           System.out.println("7  |" + " Afrekenen");
           
           
           productNummer = keyboard.nextInt();
           keyboard.nextLine();
           switch (productNummer){
               case 1:
                   System.out.println("Gekozen product:" + producten[1]);
                   System.out.println("Hoeveel wilt u er?");
                   aantalProduct = keyboard.nextInt();
                   keyboard.nextLine();
                   System.out.println("U heeft er " + aantalProduct + " toegevoegd");
                   countPizza = countPizza + aantalProduct;
                   break; 
               case 2:
                   System.out.println("Gekozen product:" + producten[2]);
                   System.out.println("Hoeveel wilt u er?");
                   aantalProduct = keyboard.nextInt();
                   keyboard.nextLine();
                   System.out.println("U heeft er " + aantalProduct + " toegevoegd");
                   countPatat = countPatat + aantalProduct;
                   break;
               case 3: 
                   System.out.println("Gekozen product:" + producten[3]);
                   System.out.println("Hoeveel wilt u er?");
                   aantalProduct = keyboard.nextInt();
                   keyboard.nextLine();
                   System.out.println("U heeft er " + aantalProduct + " toegevoegd");
                   countSnoep = countSnoep+ aantalProduct;
                   break;
               case 4: 
                   System.out.println("Gekozen product:" + producten[4]);
                   System.out.println("Hoeveel wilt u er?");
                   aantalProduct = keyboard.nextInt();
                   keyboard.nextLine();
                   System.out.println("U heeft er " + aantalProduct + " toegevoegd");
                   countKaas = countKaas + aantalProduct;
                   break;
               case 5: 
                   System.out.println("Gekozen product:" + producten[5]);
                   System.out.println("Hoeveel wilt u er?");
                   aantalProduct = keyboard.nextInt();
                   keyboard.nextLine();
                   System.out.println("U heeft er " + aantalProduct + " toegevoegd");
                   countBier = countBier + aantalProduct;
                   break;
               case 6:
                   System.out.println("Gekozen product:" + producten[6]);
                   System.out.println("Hoeveel wilt u er?");
                   aantalProduct = keyboard.nextInt();
                   keyboard.nextLine();
                   System.out.println("U heeft er " + aantalProduct + " toegevoegd");
                   countFruit = countFruit + aantalProduct;
                   break;
               case 7: 
                   double totaalPizza = countPizza * prijzen [1];
                   double totaalPatat = countPatat * prijzen [2];                
                   double totaalSnoep = countSnoep * prijzen [3];
                   double totaalKaas = countKaas * prijzen [4];                 
                   double totaalBier = countBier * prijzen [5];
                   double totaalFruit = countFruit * prijzen [6];
                         
                   System.out.println("Hieronder zie je je bestelde producten met de toebehorende prijs erachter.");
                   System.out.println(countPizza + " | Pizza     €" + totaalPizza);
                   System.out.println(countPatat + " | Patat     €" + totaalPatat);
                   System.out.println(countSnoep + " | Snoep     €" + totaalSnoep);
                   System.out.println(countKaas + " | Kaas      €" + totaalKaas);
                   System.out.println(countBier + " | Bier      €" + totaalBier);
                   System.out.println(countFruit + " | Fruit     €" + totaalFruit);
                   System.out.println("Subtotaal:    €" + (totaalPizza + totaalPatat + totaalSnoep + totaalKaas + totaalBier + totaalFruit));
                   double BTW = (totaalPizza + totaalPatat + totaalSnoep + totaalKaas + totaalBier + totaalFruit)*0.06;
                   System.out.println("BTW 6%: " + BTW);
                   System.out.println("Totaal bedrag:    €" + ((totaalPizza + totaalPatat + totaalSnoep + totaalKaas + totaalBier + totaalFruit)+BTW) );
                   winkelen = false; 
              
           }
       
       
       }
       
       
       
    }
    
}
