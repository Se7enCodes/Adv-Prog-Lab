/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandling;
import java.util.Scanner;


public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        try{
            System.out.println("Enter first number:");
            int a = Sc.nextInt();
            System.out.println("Enter second number:");
            int b = Sc.nextInt();
            int result = a/b;
            System.out.println("result =" + result);
        }
        catch(ArithmeticException e){
            System.out.println("error - cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
    
}
