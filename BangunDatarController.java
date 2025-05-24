/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kalkulator.bangundatar.controller;

/**
 *
 * @author smpyp
 */

import com.kalkulator.bangundatar.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BangunDatarController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/hitung/persegi")
    public String hitungPersegi(@RequestParam double sisi, Model model) {
        Persegi persegi = new Persegi(sisi);
        model.addAttribute("nama", "Persegi");
        model.addAttribute("luas", persegi.getLuas());
        model.addAttribute("keliling", persegi.getKeliling());
        return "hasil";
    }

    @PostMapping("/hitung/persegi-panjang")
    public String hitungPersegiPanjang(@RequestParam double panjang,
                                       @RequestParam double lebar,
                                       Model model) {
        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
        model.addAttribute("nama", "Persegi Panjang");
        model.addAttribute("luas", pp.getLuas());
        model.addAttribute("keliling", pp.getKeliling());
        return "hasil";
    }

    @PostMapping("/hitung/segitiga")
    public String hitungSegitiga(@RequestParam double alas,
                                 @RequestParam double tinggi,
                                 @RequestParam double sisiA,
                                 @RequestParam double sisiB,
                                 @RequestParam double sisiC,
                                 Model model) {
        Segitiga s = new Segitiga(alas, tinggi, sisiA, sisiB, sisiC);
        model.addAttribute("nama", "Segitiga");
        model.addAttribute("luas", s.getLuas());
        model.addAttribute("keliling", s.getKeliling());
        return "hasil";
    }

    @PostMapping("/hitung/lingkaran")
    public String hitungLingkaran(@RequestParam double jariJari, Model model) {
        Lingkaran l = new Lingkaran(jariJari);
        model.addAttribute("nama", "Lingkaran");
        model.addAttribute("luas", l.getLuas());
        model.addAttribute("keliling", l.getKeliling());
        return "hasil";
    }

    @PostMapping("/hitung/jajar-genjang")
    public String hitungJajarGenjang(@RequestParam double alas,
                                     @RequestParam double tinggi,
                                     @RequestParam double sisiMiring,
                                     Model model) {
        JajarGenjang jg = new JajarGenjang(alas, tinggi, sisiMiring);
        model.addAttribute("nama", "Jajar Genjang");
        model.addAttribute("luas", jg.getLuas());
        model.addAttribute("keliling", jg.getKeliling());
        return "hasil";
    }
}

