package com.mycompany.exercise04;

public class Exercise04 {

    public static void main(String[] args) {
        
        Circle circle = new Circle(7);
        Rectangle rec = new Rectangle(10,10);
        
        circle.display(circle.CalculateArea());
        rec.display(rec.CalculateArea());
       
    }
}
