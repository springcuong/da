/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author HOAI NGUYEN
 */
public class Bai04 {
    public static void main(String[] args)
    {
        Shape htron = new Circle(5, 1, 2);
        System.out.println("- Hinh tron");
        System.out.println("Cach goi 1");
        System.out.println("   Chu vi hinh tron la: " + htron.calcPerimeter());
        System.out.println("   Dien tich hinh tron la: " + htron.calcArea());
        System.out.println("Cach goi 2");
        System.out.println("   " + htron.toString());
        System.out.println("");
        Shape hcn = new Rectangle(3, 15, 8, 5);
        System.out.println("- Hinh chu nhat");
        System.out.println("Cach goi 1");
        System.out.println("   Chu vi hinh chu nhat: " + hcn.calcPerimeter());
        System.out.println("   Dien tich hinh chu nhat " + hcn.calcArea());
        System.out.println("Cach goi 2");
        System.out.println("   " + hcn);
                
    }
}
