package com.mycompany.exercise04;

public abstract class Shape {
    
   public abstract double CalculateArea();
   
   public void display(double area){
       System.out.println("Area is " + area);
   }
    
}