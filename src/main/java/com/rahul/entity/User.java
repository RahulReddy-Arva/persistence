package com.rahul.entity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
public class User {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    private String firstname;
    private String lastname;

    @Column(unique = true)
    private String email;

//    @OneToOne  // Each user must have a unique address . so its a one to one mapping.
    @OneToMany
    private List<Address> addresses;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> address) {
        this.addresses = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
