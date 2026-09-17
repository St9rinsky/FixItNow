package com.fixitnow.Domain;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String mobileNum;

    @Enumerated(EnumType.STRING)
    private Roles role;

//--------------------------CONSTRUCTORS----------------------------------------------------//
    public User(String name, String email, String mobileNum, Roles role) {
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.role = role;
    }

    protected User() {
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

    public String getMobileNum() {
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

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
