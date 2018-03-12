/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabai1;
/**
 *
 * @author VuPhuc
 */
public class Calculator {
    float num1;
    float num2;
    
    void add(float num1, float num2){
            System.out.println("add = " + (num1 + num2));
    }
    void sub(float num1, float num2){
        System.out.println("sub = " + (num1 - num2));
    }
    void mul(float num1, float num2){
        System.out.println("mul = " + (num1 * num2));
    }
    void divide(float num1, float num2){
        if(num2 == 0){
            System.out.println("Cannot divide");
        }
        else{
        System.out.println("divide = " + (num1 / num2));
        }
    }
}

