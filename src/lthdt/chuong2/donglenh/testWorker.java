/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lthdt.chuong2.employeelogic.Worker;

/**
 *
 * @author HOAI NGUYEN
 */
public class testWorker {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "12-12-2001";
        Date ngaysinh = df.parse(input);
        Worker obj = new Worker("IBM", "Nhan vien", "Hoai Nguyen", 0, ngaysinh);
        
         switch(obj.getChucvu()){
            case "Giam doc":
            obj.setTienthuong(1000);
            break;
            case "Nhan vien":
            obj.setTienthuong(800);
            break;
            default:
            obj.setTienthuong(400);
            break;
        }
        System.out.println(obj);
    }
}
