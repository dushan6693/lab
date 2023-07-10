package com.mycompany.question12;

public class Question12 {

    public static void main(String[] args) {
       int[] array = new int[3];
       
       try{
               int x=array[5];
           
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Exp: "+ e.getMessage());
       }
    }
}
