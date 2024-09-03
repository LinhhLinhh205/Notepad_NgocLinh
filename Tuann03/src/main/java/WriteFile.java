
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class WriteFile {
    public static void main(String[] args) {
        String str="Toi ten la Linh \n Toi 19 tuoi";
        try{
            FileWriter fw=new FileWriter("baitho.txt");
            fw.write(str);
            fw.close();
            System.out.println("Da ghi xong");
        }catch(Exception ex){
            System.out.println("Loi xay ra: "+ex.toString());
        }
    }
}
