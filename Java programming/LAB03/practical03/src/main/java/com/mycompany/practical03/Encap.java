package com.mycompany.practical03;

public class Encap {
    
    private String name;
    private int age;
    private double salary;
    private double bonus;

    //getters and setters are here
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
            return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
     public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    
    //constructor
    public Encap(double bonus){
        this.bonus = bonus;
    }

    public double bonusAmount(){
        return salary+bonus;
    }
    
    
}
