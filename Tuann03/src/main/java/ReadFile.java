
import java.io.BufferedReader;
import java.io.FileReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("baitho.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            fr.close();
            System.out.println("\n Da doc xong");
        }catch (Exception ex){
            System.out.println("Loi xay ra: "+ex.toString());
        }
    }
}
