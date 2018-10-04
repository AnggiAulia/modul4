/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumAbstrak;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends bangunDatar{
    private double r;

public Lingkaran(double r) {
    this.r = r;
    }

    Lingkaran(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@Override
public double hitungKeliling() {
    return 2 * 3.14 * r;
}
@Override
public double hitungLuas() {
    return 3.14 *r * r;
}
    
}
