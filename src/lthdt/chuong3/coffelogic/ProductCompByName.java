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
public class ProductCompByName implements Comparator<Product>{
//Sap xep theo ten san pham
    @Override
    public int compare(Product o1, Product o2) {
        return  o1.getName().compareToIgnoreCase(o2.getName());
    }
    
}
