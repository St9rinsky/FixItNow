package com.fixitnow.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String mobileNum;

    @Enumerated(EnumType.STRING)
    private Roles role;


    public User(Long id, String name, String email, String mobileNum, Roles role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.role = role;
    }

    //----------GETTERS----------------//

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getMobileNum() {
        return mobileNum;
    }

    public Roles getRole() {
        return role;
    }

    //-----------SETTERS-----------------//

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
