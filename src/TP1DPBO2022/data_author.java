/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1DPBO2022;

/**
 *
 * @author Hagai
 */
public class data_author {
    private int id;
    private String img;
    private String nama;
    private int juml;

    public data_author(int id, String img, String nama, int juml) {
        this.id = id;
        this.img = img;
        this.nama = nama;
        this.juml = juml;
    }

     public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJuml(int juml) {
        this.juml = juml;
    }
    
    
    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getNama() {
        return nama;
    }

    public int getJuml() {
        return juml;
    }

   
}
