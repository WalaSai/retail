/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailshop;

import java.util.Scanner;

/**
 *
 * @author wala
 */
public class RetailShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name = scan.next();
       System.out.println("Enter your type: ");
       String type = scan.next();
       System.out.println("Enter the year you joined: ");
       int year = scan.nextInt();
       int choice = 0;
       int count = 0;
       int total = 0;
       do{
           choice = menu();
           if(choice == 5)
                break;
         
           total = total + choice;
            count++;
        
            
       }while(choice !=5 || count != 10);
       
       double discount = 1;
       if(type =="employee"){
           discount = 0.3;
       }
       else if(type =="affiliate"){
           discount = 0.1;
       }
       else if(year < 2017){
           discount = 0.5;
       }
       
       else if(total >= 100){
           int i = total;
           int discountBill = 0;
           while(i>=100){
               discountBill = discountBill + 5;
               i = i - 100;
           }
           double finalPrice = total - discountBill;
           System.out.println("$" + finalPrice);
       }
       double discountPrice = total * discount;
       double finalPrice = total - discountPrice;
       System.out.println("$" + finalPrice);
               
    }
    
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Choose an item to add: ");
        System.out.println("1. Apple - $1");
        System.out.println("2. Orange - $2");
        System.out.println("3. Peach - $3");
        System.out.println("4. Mango - $4");
        System.out.println("5. Finish Order");
        System.out.println();
        System.out.println("Your choice: ");
        return scan.nextInt();
                
    }
    
}
