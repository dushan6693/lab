package com.mycompany.exercise04;

public class Exercise04 extends Mammal{  //imagine the exercise04 as dog class

    public static void main(String[] args) {
        
        Animal a = new Animal();
      Mammal m = new Mammal();
      Exercise04 d = new Exercise04(); //imagine the exercise04 as dog class
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
    }
}


//Output is:

/*
true
true
true
*/