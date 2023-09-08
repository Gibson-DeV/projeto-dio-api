package com.empresa.projeto.entity;

import jakarta.persistence.*;

@Entity(name = "tb_cartao")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private long numero;

    private double limite;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNumero(){
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
