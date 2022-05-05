/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author HOAI NGUYEN
 */
public class Worker extends Person implements TaxInterface{
    private String congty;
  
    public Worker() {
    }

    public Worker(String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    @Override
    public double calcTax(double income) {
        return (0.04 * income);
    }
    
     
}
