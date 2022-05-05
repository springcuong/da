/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author HOAI NGUYEN
 */
public class Bai06 {
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "08-11-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Trinh Hoai Nguyen", 1, ngaysinh);
        
        System.out.println("Ho ten: " + person.getHoten() + 
                "; gioi tinh: " + person.getGioitinh() + 
                "; ngay sinh: " + df.format(person.getNgaysinh()));
        System.out.println("");
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Trinh Hoai A");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("01-01-2001"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println("Sinh vien");
        System.out.println("   Ho ten: " + sinhvien.getHoten() + 
                "; gioi tinh: " + sinhvien.getGioitinh() +
                "; ngay sinh: " + sinhvien.getNgaysinh() +
                "; truong hoc: " +  sinhvien.getTruonghoc());
        System.out.println("   Tien thue: " + sinhvien.calcTax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Trinh Hoai B");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("01-02-2000"));
        congnhan.setCongty("IBM");
        System.out.println("Cong nhan");
        System.out.println("   Ho ten: " + congnhan.getHoten() + 
                           "; gioi tinh: " + congnhan.getGioitinh() + 
                           "; ngay sinh: " + congnhan.getNgaysinh() + 
                           "; cong ty: " + congnhan.getCongty());
        System.out.println("   Tien thue: " + congnhan.calcTax(2000));
    }
}
