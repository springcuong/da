/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.employeelogic;

import java.util.Date;

/**
 *
 * @author HOAI NGUYEN
 */
public class Worker extends Person implements TaxInterface{
    private String congty;
    private String chucvu;
    private double tienthuong;

    public Worker() {
    }

    public Worker(String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
    }

   
    public Worker(String congty, String chucvu, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.congty = congty;
        this.chucvu = chucvu;
     
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    @Override
    public double calcTax(double income) {
        return (0.04 * income);
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "Worker{" + "congty=" + congty + ", chucvu=" + chucvu + ", tienthuong=" + tienthuong + '}';
        return ketqua;
    }
    
     
}
