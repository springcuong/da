/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong3.coffelogic.Coffeeshop;
import lthdt.chuong3.coffelogic.Manager;

/**
 *
 * @author HOAI NGUYEN
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Coffeeshop[] a = new Coffeeshop[]{new Coffeeshop("Kha coffee", "01 Hung Vuong"),
                                          new Coffeeshop("Hai coffee", "01 Ham Nghi"),
                                          new Coffeeshop("Mai coffee", "01 Nguyen Hue")};
        
        Manager[] managers = new Manager[]{
                                 new Manager(a, 1000, "Bui Van A", 0, df.parse("11-12-2001")),
                                 new Manager(new Coffeeshop[]{
                                                new Coffeeshop("Hoang Nam", "10 Hung Vuong")
                                 }, 1000, "Nguyen Van A", 1, df.parse("12-12-2002"))
                                          };
        System.out.println(Arrays.toString(managers));
    }
    
}
