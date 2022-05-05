/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong5.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOAI NGUYEN
 */
public class FileAndDrectoryOperations {

    public FileAndDrectoryOperations() {
    }
    
    //Thao tac 1: liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDrectoryContent (String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return  null;
        File[] resulce = directory.listFiles();
        return  resulce;
    }
    
    //Thao tac 2: xuat ket qua
    public String displayContent (File[] content){
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
     //Thao tac 3: loc ra cac thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for ( int i =0; i < content.length; i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return  result.toArray(ketqua);
    }
    
    //Thao tac 4: loc ra tat ca cac tap tin
    public  File[] getFile(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for ( int i =0; i < content.length; i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return  result.toArray(ketqua);
    }
    
    //Thao tac 5: duyet de quy xuat tat ca cac tap tin va thu muc
    public void  getContentRecursively (String foder){
        File content = new File(foder);
        //Dieu kien dung
        if ( content.isFile()){
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //cau goi de quy trong stack
        System.out.println("Thu muc: " +  foder);
        File[] sub = content.listFiles();
        for ( int i = 0; i < sub.length; i++)
        {
        getContentRecursively(foder + File.separator + sub[i].getName());
        }
    }
    
    //Thao tac 6: Doc file van ban
    public  String readTexFile(String fileName){
        StringBuilder content = new StringBuilder();
        
        try {
            //Mo file
            FileReader fr = new FileReader(fileName);
            //Dung bo dem
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
            }
            
            //Doc file
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            return "Khong tim thay file " + fileName;
        } catch (IOException ex){
            return "Khong the doc file " + fileName;
        }
        
        return  content.toString();
        
    }
    
    //Thao tac 7: luu tap tin van ban
    public boolean writeFile(String filename, String content){
        boolean flag = true; //Luu thanh cong
        
       
        try {
            //Mo file
            FileWriter fw = new FileWriter(filename);
            //Su dung buffer
            BufferedWriter bw = new BufferedWriter(fw);
            //Ghi ra file
            bw.write(content);
            //Dong file
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        
        return flag;
        
    }
}
