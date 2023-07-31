package com.mycompany.practical03;

public class Practical03 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Encap encap = new Encap(2000.00);
        
        encap.setName("Bogdan");
        encap.setAge(23);
        encap.setSalary(50000.00);
        
        String name = encap.getName();
        int age = encap.getAge();
        double salary = encap.getSalary();
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        
        System.out.println("Bonus Amount: "+encap.bonusAmount());
    }
}
