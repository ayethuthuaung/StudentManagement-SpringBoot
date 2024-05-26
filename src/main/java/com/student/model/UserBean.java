package com.student.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String code;

    @NotEmpty(message = "Name must not be empty")
    private String name;

    @NotEmpty(message = "Email must not be empty")
    @Pattern(regexp = "\\b[A-Za-z0-9._%+-]+@gmail\\.com\\b", message = "Email must be a Gmail address")
    private String email;


    private String gender;
    private String password;

    private String phone;

    private String dob;

    private String address;

    public String role;

    //forsoftdelete
    private boolean deleted;

    @PrePersist
    protected void onCreate() {
        this.deleted = true;
    }

}
