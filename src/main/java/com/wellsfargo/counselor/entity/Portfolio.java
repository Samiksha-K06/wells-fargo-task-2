package com.wellsfargo.counselor.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;


    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;


    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;


    public Portfolio() {
    }


    public Portfolio(Client client, List<Security> securities) {
        this.client = client;
        this.securities = securities;
    }


    public Long getPortfolioId() {
        return portfolioId;
    }


    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }


    public List<Security> getSecurities() {
        return securities;
    }


    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}