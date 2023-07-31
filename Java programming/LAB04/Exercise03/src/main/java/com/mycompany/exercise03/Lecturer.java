package com.mycompany.exercise03;

public class Lecturer extends Person{
//    private String name;
//    private int id;               not nesessary at this class. because Lecturer inherited to Person
    private String programme;

    public Lecturer(String name, int id, String programme) {
        super(name, id);
        this.programme=programme;
    }

    //setters
    public void setProgramme(String programme) {
        this.programme = programme;
    }

    //getters
    public String getProgramme() {
        return programme;
    }
}
