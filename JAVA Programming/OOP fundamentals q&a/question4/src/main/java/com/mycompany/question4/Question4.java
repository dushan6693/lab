package com.mycompany.question4;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter number 1  ");
        num1 = scanner.nextInt();
        System.out.print("Enter number 2  ");
        num2 = scanner.nextInt();
        System.out.print("Enter number 3  ");
        num3 = scanner.nextInt();
        
        System.out.println("Avg is "+(num1+num2+num3)/3);
        System.out.println("Sum is "+(num1+num2+num3));
        System.out.println("Product is "+num1*num2*num3);
        
        int min=0,max=0;
        if(num1>num2){
            max=num1;
            min=num2;
        }else if(num1<num2){
            max=num2;
            min=num1;
        }
        if(num3>max){
            max=num3;
        }
        if(num3<min){
            min=num3;
        }
        System.out.println("minimum number is "+min+" and maximum number is "+max);
    }
}
