package org.launchcode.deedaday.models;


import org.hibernate.exception.DataException;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

//TODO: add admin role

@Entity // Required for hibernate to store/get instances of a database
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, message = "Username must be at least 3 characters")
    private String username;

    @NotNull
    @Size(min = 1, message = "First name cannot be left blank")
    private String firstname;

    @NotNull
    @Size(min = 1, message = "Last name cannot be left blank")
    private String lastname;

    //TODO: get form to throw an error when passwords don't match.  Currently only does it if is left blank.
    @NotNull
    @Size(min = 5, message = "Password must be at least 5 characters and must match")
    private String password;

    @NotNull
    @Email(message = "Not a valid e-mail address")
    @Size(min = 1, message = "E-mail cannot be left blank")
    private String email;


    @NotEmpty
    private String phoneNumber;

    private boolean Admin = false;


    public User() {
    }

    public User(String username, String firstname, String lastname, String password, String email) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;

    }


    //GETTERS AND SETTERS
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getAdmin() {
        return this.Admin;
    }

    public void setAdmin(boolean admin) {
        this.Admin = admin;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}


