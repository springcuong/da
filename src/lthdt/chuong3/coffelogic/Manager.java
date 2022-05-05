/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.coffelogic;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author HOAI NGUYEN
 */
public class Manager extends Person{
    private Coffeeshop[] shops;
    private double income;

    public Manager() {
        super();
    }

    public Manager(Coffeeshop[] shops, double income, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.shops = shops;
        this.income = income;
    }

    public Coffeeshop[] getShops() {
        return shops;
    }

    public void setShops(Coffeeshop[] shops) {
        this.shops = shops;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "Manager{" + "shops=" + Arrays.toString(shops) + ", income=" + income + '}';
        return ketqua;
    }

      
    
    
}
