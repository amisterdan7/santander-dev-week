package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true)
    private String cardNumber;

    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal cardlimit;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getCardlimit() {
        return cardlimit;
    }

    public void setCardlimit(BigDecimal cardlimit) {
        this.cardlimit = cardlimit;
    }
}
