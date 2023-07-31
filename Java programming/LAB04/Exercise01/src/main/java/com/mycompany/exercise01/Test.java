package com.mycompany.exercise01;

public class Test {
    
    Employee emp_bogan = new Employee();
    Employee emp_bird = new Employee();
    
    public void test(){
    
        //set bogan
        emp_bogan.setEmpID(01);
        emp_bogan.setEmpName("Mr.Bogan");
        emp_bogan.setEmpDesignation("Head");
        
        //print/get Bogan
    System.out.println("Mr.Bogan details:");
    System.out.println("ID:"+emp_bogan.getEmpID());
    System.out.println("Name:"+emp_bogan.getEmpName());
    System.out.println("Designation:"+emp_bogan.getEmpDesignation());
    System.out.println("");
        
    //set bird
         emp_bird.setEmpID(02);
        emp_bird.setEmpName("Ms.Bird");
        emp_bird.setEmpDesignation("Manager");
    
        //print/get Bird
    System.out.println("Ms.Bird details:");
    System.out.println("ID:"+emp_bird.getEmpID());
    System.out.println("Name:"+emp_bird.getEmpName());
    System.out.println("Designation:"+emp_bird.getEmpDesignation());
    System.out.println("");
    
    
    
    }
    
    
}
