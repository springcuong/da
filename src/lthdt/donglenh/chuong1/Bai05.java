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
public class Bai05 {
    public static void main(String[] arge) throws ParseException
    {
      //Chuyển kiểu data thành string
//        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH); //dùng cho ngày và giờ
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date currentDate = new Date();
        String output = df.format(currentDate); //Hiển thị ngày giờ hiện tại
        System.out.println(output);
        
      //Chuyển kiểu dữ liệu String thành Date
      String input ="08-11-2001";
      Date ngay = df.parse(input);
      System.out.println(ngay);
      System.out.println(df.format(ngay));
    }
}
