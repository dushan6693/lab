package com.mycompany.exercise03;

final class Student {
    
    final int marks = 100;
    
    final void display();
    
}
//reason for error:
//That display function has not a body. so its a Abstract method.
//we can only use/implement abstract methods inside abstract classes. so you should that Student class make Abstract to fix that Error
