package com.mycompany.exercise04;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double CalculateArea(){
        return Math.PI*radius*radius;
        
    }
}
