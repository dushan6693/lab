package com.mycompany.question3;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        double f,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheite ");
        f = scanner.nextDouble();
        c = 5.0/9.0*(f-32);
        System.out.println("Celsius value is " + c);
        
    }
}
