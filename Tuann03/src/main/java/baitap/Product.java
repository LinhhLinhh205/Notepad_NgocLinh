/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

/**
 *
 * @author PC
 */
public class Product {
    private String maso;
    private String ten;
    private Float gia;

    public Product(String maso, String ten, Float gia) {
        this.maso = maso;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" + "maso=" + maso + ", ten=" + ten + ", gia=" + gia + '}';
    }
    
}
