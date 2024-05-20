package com.student.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class UserBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Code must not be empty")
    private String code;

    @NotEmpty(message = "Name must not be empty")
    private String name;

    @NotEmpty(message = "Email must not be empty")
    @Pattern(regexp = "\\b[A-Za-z0-9._%+-]+@gmail\\.com\\b", message = "Email must be a Gmail address")
    private String email;

    @NotEmpty(message = "Gender must not be empty")
    private String gender;

    @NotEmpty(message = "Phone must not be empty")
    @Size(min = 8, max = 12, message = "Phone number must be between 8 and 12 characters")
    private String phone;

    @NotEmpty(message = "Date of Birth must not be empty")
    private String dob;

    @NotEmpty(message = "Address must not be empty")
    private String address;

    private String role;

    private String password;

    //forsoftdelete
    private boolean deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotEmpty(message = "Code must not be empty") String getCode() {
        return code;
    }

    public void setCode(@NotEmpty(message = "Code must not be empty") String code) {
        this.code = code;
    }

    public @NotEmpty(message = "Name must not be empty") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name must not be empty") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Email must not be empty") @Pattern(regexp = "\\b[A-Za-z0-9._%+-]+@gmail\\.com\\b", message = "Email must be a Gmail address") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "Email must not be empty") @Pattern(regexp = "\\b[A-Za-z0-9._%+-]+@gmail\\.com\\b", message = "Email must be a Gmail address") String email) {
        this.email = email;
    }

    public @NotEmpty(message = "Gender must not be empty") String getGender() {
        return gender;
    }

    public void setGender(@NotEmpty(message = "Gender must not be empty") String gender) {
        this.gender = gender;
    }

    public @NotEmpty(message = "Phone must not be empty") @Size(min = 8, max = 12, message = "Phone number must be between 8 and 12 characters") String getPhone() {
        return phone;
    }

    public void setPhone(@NotEmpty(message = "Phone must not be empty") @Size(min = 8, max = 12, message = "Phone number must be between 8 and 12 characters") String phone) {
        this.phone = phone;
    }

    public @NotEmpty(message = "Date of Birth must not be empty") String getDob() {
        return dob;
    }

    public void setDob(@NotEmpty(message = "Date of Birth must not be empty") String dob) {
        this.dob = dob;
    }

    public @NotEmpty(message = "Address must not be empty") String getAddress() {
        return address;
    }

    public void setAddress(@NotEmpty(message = "Address must not be empty") String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
