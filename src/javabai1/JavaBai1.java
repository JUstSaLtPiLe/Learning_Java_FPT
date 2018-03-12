/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabai1;
import java.util.Scanner;

/**
 *
 * @author VuPhuc
 */
public class JavaBai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator object1 = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Num1: ");
        float num1 = input.nextFloat();
        System.out.println("Input Num2: ");
        float num2 = input.nextFloat();
        object1.add(num1, num2);
        object1.sub(num1, num2);
        object1.mul(num1, num2);
        object1.divide(num1, num2);
    }
    
}
