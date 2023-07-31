package com.mycompany.exercise03;

public class Student extends Person{
  //  private String name;
//    private int id;               not nesessary at this class. because Lecturer inherited to Person
  
    private String course;

    public Student( String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    //setters
    public void setCourse(String course) {
        this.course = course;
    }

    //getters
   public String getCourse() {
        return course;
    }
    
   
}
