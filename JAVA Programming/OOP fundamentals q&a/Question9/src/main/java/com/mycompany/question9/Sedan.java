package com.mycompany.question9;

public class Sedan extends Car {
    private int length;
    
    public double getSalePrice(){
        if(length>20){
            return 0.05;
        }else{
            return 0.10;
        }
    }
}
