package com.mycompany.question9;

public class Truck extends Car{
   int weight;
   
   public double getSalePrice(){
       if(weight>200){
           return 0.10;
       }else{
           return 0.20;
       }
   }
}
