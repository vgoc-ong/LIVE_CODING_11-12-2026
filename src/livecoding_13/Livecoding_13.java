/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding_13;

import java.util.Scanner;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class Livecoding_13 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.useDelimiter("[^0-9-]+");

        int a = input.nextInt();
        int b = input.nextInt();

        int result = gcd(a, b);

        if (a < 0 || b < 0) {
            System.out.print("Invalid Input.");

        } else if (a == 0 && b == 0) {
            System.out.println("Undefined - handle in main()");

        } else {
            System.out.println(result);
        }

        input.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}