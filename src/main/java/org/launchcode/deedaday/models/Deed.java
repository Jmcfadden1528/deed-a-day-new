package org.launchcode.deedaday.models;


import javax.persistence.*;


@Entity
public class Deed {

    //Fields
    @Id
    @GeneratedValue
    public int id;

    public String title;

    public String description;

    public boolean completed;



    //Constructors
    public Deed() {}

    public Deed(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //Getters & Setters
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted() { return completed; }

    public void setCompleted() { this.completed = completed; }
}
