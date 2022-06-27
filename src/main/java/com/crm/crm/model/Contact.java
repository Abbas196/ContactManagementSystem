package com.crm.crm.model;


import jakarta.persistence.*;
import lombok.Data;

// @Data will generate both getters and setters for the class and we don't need to write getters and setters manually.

@Entity
@Data
@Table(name = "contacts_details")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    private  Contact(){}
    public Contact(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
