/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding_12;

import java.util.Scanner;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class Livecoding_12 {

    /**
     * @param args the command line arguments
     */
   public static int sumOfDigits(int number) {
       
         if (number == 0) {
            return 0;
        }
        
         return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        if (number < 0) {
            System.out.println(" Invalid input, please try again!!");
        } else {

            System.out.println(sumOfDigits(number));
        }
    }
}



