/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author HOAI NGUYEN
 */
public class PhepToan 
{
    public static void main(String[] arge)
    {
    //Các phép toán số nguyên
//    int a =17, b =4, c;
//    c = a + b;
//    System.out.println("Phep cong: " + a + " + " + b + " = " + c);
//    c = b - a;
//    System.out.println("Phep tru: " + b + " - " + a + " = " + c);
//    c = a * b;
//    System.out.println("Phep nhan: " + a + " * " + b + " = " + c);
//    c = a / b;
//    System.out.println("Phep chia lay so nguyen: " + a + " / " + b + " = " + c);
//    c = a % b;
//    System.out.println("Phep chia lay so du: " + a + " % " + b + " = " + c);
    
    //Các phép toán với số thực
//    double x = 14.3, y = 3.56, z;
//    z = x + y;
//    System.out.println("Phep cong: " + x + " + " + y + " = " + z);
//    z = y - x;
//    System.out.println("Phep tru: " + y + " - " + x + " = " + z);
//    z = y * x;
//    System.out.println("Phep nhan: " + x + " * " + y + " = " + z);
//    z = x/y;
//    System.out.println("Phep chia: " + x + " / " + y + " = " + z);
    
    //Cac phep toán tren kieu logic
//      boolean flag1 = true, flag2 = false, flag3 = true;
//      System.out.println("Phep AND " + (flag1 && flag2));
//      System.out.println("Phep OR " + (flag1 || flag2));
//      System.out.println("Phep NOT " + (!flag1));
//      System.out.println("Phep XOR " + (flag1 ^ flag3));
    
    //Mot so phep toan co ban tren chuoi
      String s1 = "Hue University";
      String s2 = "university";
      
      System.out.println(s1.toLowerCase()); //chữ thường
      System.out.println(s2.toUpperCase()); //chữ hoa
      System.out.println(s1.contains(s2));  //so sánh chuổi s1 có chứa s2
      System.out.println(s1.toLowerCase().contains(s2)); //chuyển s1 về chữ thường rồi so sánh với s2
      s1 += " " + s2; //Hiển thị cả s1 và s2
      System.out.println(s1);
      
      
    }
}
