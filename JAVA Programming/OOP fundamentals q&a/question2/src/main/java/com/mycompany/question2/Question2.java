package com.mycompany.question2;
import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1 ");
        num1=scanner.nextInt();
        System.out.println("Enter number 2 ");
        num2=scanner.nextInt();
        
        System.out.println("Product is "+num1*num2);
    }
}
