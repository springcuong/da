/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.coffelogic;

import java.util.Comparator;

/**
 *
 * @author HOAI NGUYEN
 */
public class ProductCompByPrice implements Comparator<Product>{
//Sap xep theo gia san pham
    @Override
    public int compare(Product o1, Product o2) {
        double temp = (o1.getPrice() - o2.getPrice()); //Sap xep tang dan
//        double temp = -(o1.getPrice() - o2.getPrice()); //Sap xep giam dan
        return (int) temp;
    }
    
}
