/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import lthdt.chuong2.logiclayer.PhuongTrinhBac2;

/**
 *
 * @author HOAI NGUYEN
 */
public class tsetPTB2 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2");
        PhuongTrinhBac2 obj = new PhuongTrinhBac2(0,-4,2);
        obj.GiaiPhuongTrinh();
        System.out.println(obj.toString());
    }
}
