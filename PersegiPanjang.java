/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kalkulator.bangundatar.model;

/**
 *
 * @author smpyp
 */
public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
}
