package com.mycompany.exercise02;

public class Exercise02 { // imagine this class ass the TestInheritance class.

    public static void main(String[] args) {
        
        
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        
        System.out.println( b.returnIt() ); 
        
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        
        System.out.println( c.returnIt() ); 
    
    }
    
}
