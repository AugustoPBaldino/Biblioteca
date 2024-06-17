package com.example.Biblioteca.Models;

import jakarta.persistence.*;


@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBook;
    private String author;
    @Column(name = "num_Pages")
    private int numPages;
    private String gender;
    private int yearPublication;
    private boolean borrowed;
    public Book(long idBook, String author, int numPages, String gender, int yearPublication, boolean borrowed) {
        this.idBook = idBook;
        this.author = author;
        this.numPages = numPages;
        this.gender = gender;
        this.yearPublication = yearPublication;
        this.borrowed = borrowed;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }




}
