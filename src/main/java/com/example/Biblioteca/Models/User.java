package com.example.Biblioteca.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    private Long idUser;
    private String name;
    private String email;
    private String password;
    private List borrowedBooks;
    private boolean lateLoan;

    public User(Long idUser, String name, String email, String password, List borrowedBooks, boolean lateLoan) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
        this.borrowedBooks = borrowedBooks;
        this.lateLoan = lateLoan;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public boolean isLateLoan() {
        return lateLoan;
    }

    public void setLateLoan(boolean lateLoan) {
        this.lateLoan = lateLoan;
    }
}
