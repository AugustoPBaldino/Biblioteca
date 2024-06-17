package com.example.Biblioteca.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="loans")
public class Loan {
    private Long idLoan;
    private Date initialDate;
    private Date finalDate;
    private int loanFine;

    public Long getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(Long idLoan) {
        this.idLoan = idLoan;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public int getLoanFine() {
        return loanFine;
    }

    public void setLoanFine(int loanFine) {
        this.loanFine = loanFine;
    }

    public Loan(Long idLoan, Date initialDate, Date finalDate, int loanFine) {
        this.idLoan = idLoan;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.loanFine = loanFine;
    }
}
