/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.util.Random;

/**
 *
 * @author HOAI NGUYEN
 */
public class testFor {
    public static void main(String[] args) {
        //Tinh tong thu nhat s = 1 + 1/1 + 1/2+...+ 1/n
        int n= 100;
        double s= 0;
        for(int i = 1; i <= n; i++){
            s = s + (double)1/i;
        }
        System.out.println("Tong thu nhat la: " + s);
        
        //Tinh tong thu hai s = 1 + 3 + 5 +...+ (n-2) + n, n la so nguyen duong le
        n=99;
        int s2 = 0;
        for (int i = 1; i <= n; i+=2 ){
            s2 = s2 + i;
        }
        System.out.println("Tong thu nhat la: " + s2);
        
        //Sinh ngau nhien n so nguyen
//        Random rnd = new Random();
//        int x;
        for(int i = 0; i < 10; i++)
        {
            Random rnd = new Random();
           int x =rnd.nextInt(101);
            System.out.println(x);
        }
    }
    
}
