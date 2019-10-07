package com.example.isipulsaapp.activity;

public class OperatorPulsa {
    private String operator;
    private int nominal;
    private int harga;

    public OperatorPulsa(String operator, int nominal, int harga) {
        this.operator = operator;
        this.nominal = nominal;
        this.harga = harga;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
