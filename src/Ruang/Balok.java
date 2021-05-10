/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;

import Bidang.PersegiPanjang;
/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{

    double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
        @Override
        public double Volume(){
        double volumebalok;
        volumebalok = panjang*lebar*tinggi;
        return volumebalok;
    }
    
        @Override
        public double Luaspermukaan(){
        double luaspermukaanbalok;
        luaspermukaanbalok = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        return luaspermukaanbalok;
    }
    
    
}
