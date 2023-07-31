package com.mycompany.exercise02;

public class SubC extends SuperB{
    
    @Override
    void triple (){// override existing method
        x=x+3;
    } 
    
    void quadruple (){// new method
        x=x*4;
    } 

}
