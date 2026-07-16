package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;


    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor financialAdvisor;


    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;


    public Client() {
    }


    public Client(String firstName, String lastName, String email,
                  FinancialAdvisor financialAdvisor, Portfolio portfolio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.financialAdvisor = financialAdvisor;
        this.portfolio = portfolio;
    }


    public Long getClientId() {
        return clientId;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }


    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }


    public Portfolio getPortfolio() {
        return portfolio;
    }


    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}