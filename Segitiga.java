/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kalkulator.bangundatar.model;

/**
 *
 * @author smpyp
 */
public class Segitiga {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return sisiA + sisiB + sisiC;
    }
}

