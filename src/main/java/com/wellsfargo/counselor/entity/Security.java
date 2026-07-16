package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;


@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;


    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;


    @Column
    private String securityName;


    @Column
    private String category;


    @Column
    private Date purchaseDate;


    @Column
    private Double purchasePrice;


    @Column
    private Integer quantity;


    public Security() {
    }


    public Security(Portfolio portfolio, String securityName,
                    String category, Date purchaseDate,
                    Double purchasePrice, Integer quantity) {

        this.portfolio = portfolio;
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }


    public Long getSecurityId() {
        return securityId;
    }


    public Portfolio getPortfolio() {
        return portfolio;
    }


    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }


    public String getSecurityName() {
        return securityName;
    }


    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public Date getPurchaseDate() {
        return purchaseDate;
    }


    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    public Double getPurchasePrice() {
        return purchasePrice;
    }


    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}