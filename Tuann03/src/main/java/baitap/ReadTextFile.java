/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ReadTextFile {
    public static void main(String[] args) {
        List<Product> ds=new ArrayList<>();
        try{
            FileReader fr=new FileReader("sanpham.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                String[] a=line.split(";");
                if(a.length==3){
                    String maso=a[0];
                    String ten=a[1];
                    float gia=Float.parseFloat(a[2]);
                    Product sp=new Product(maso, ten, gia);
                    ds.add(sp);
                }
            }
            fr.close();
            System.out.println("\n Da doc xong");
        }catch (Exception ex){
            System.out.println("Loi xay ra: "+ex.toString());
        }
        System.out.println("Danh sach san pham");
        for(Product sp:ds){
            System.out.println(sp);
        }
    }
}
