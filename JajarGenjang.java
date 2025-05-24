/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kalkulator.bangundatar.model;

/**
 *
 * @author smpyp
 */
public class JajarGenjang {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double getLuas() {
        return alas * tinggi;
    }

    public double getKeliling() {
        return 2 * (alas + sisiMiring);
    }
}

