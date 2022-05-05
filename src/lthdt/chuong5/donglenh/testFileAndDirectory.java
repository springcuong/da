/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong5.donglenh;

import java.io.File;
import lthdt.chuong5.logic.FileAndDrectoryOperations;

/**
 *
 * @author HOAI NGUYEN
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDrectoryOperations fo = new FileAndDrectoryOperations();

//        File[] contenct = fo.getDrectoryContent("E:\\Học tập\\Năm 3\\HK2\\HK2 - Đợt 2\\Khai phá dữ liệu\\Bài giảng");
//        System.out.println(fo.displayContent(contenct));
//        File[] thumuc = fo.getSubDirectories(contenct);
//        System.out.println("Danh sach cac thu muc con la");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFile(contenct);
//        System.out.println("Danh sach cac tap tin");
//        System.out.println(fo.displayContent(taptin));
    
//Chay tat ca tap tin cua thu muc
       fo.getContentRecursively("E:\\Học tập");

    }
    
   
}
