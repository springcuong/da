/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import lthdt.chuong3.coffelogic.Product;
import lthdt.chuong3.coffelogic.ProductCompByName;
import lthdt.chuong3.coffelogic.ProductCompByPrice;

/**
 *
 * @author HOAI NGUYEN
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tao mang cac san pham
        Product[] sp = new Product[]{new Product("Sunsilk",12),
                                        new Product("Lifebouy", 5),
                                        new Product("Sunsilk",8),
                                        new Product("Espresso", 3),
                                        new Product("Thien long", 2)};
        System.out.println("Mang ban dau la");
        System.out.println(Arrays.toString(sp));
//        Product temp;
//        for(int i = 0; i < sp.length -1 ; i++)
//            for (int j = i + 1; j< sp.length; j++)
//                if(sp[i].getPrice() > sp[j].getPrice()){
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                }
        
        //Sap xep mang theo gia ca tang dan
//        Arrays.sort(sp, new ProductCompByPrice());
//        System.out.println("Mang sap xep tang dan theo gia ca");
//        System.out.println(Arrays.toString(sp));
        //Sap xep mang theo ten san pham tang dan
        Arrays.sort(sp, new ProductCompByName());
        System.out.println("Mang sap xep tang dan theo ten san pham");
        System.out.println(Arrays.toString(sp));
        
        int index = Arrays.binarySearch(sp, new Product("Sunsilk", 12), new ProductCompByName());
        if(index < 0){
            System.out.println("Khong tim thay");
        }else{
            System.out.println("Phan tu thu " + index + " chua gia tri can tim");
            System.out.println(index);
        }
    }
    
}
