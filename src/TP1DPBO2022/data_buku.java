/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1DPBO2022;

/**
 *
 * @author Hagai
 */
public class data_buku {
    private int id;
    private String img;
    private String penerbit;
    private String author;
    private String deskr;

    public data_buku(int id, String img, String penerbit, String author, String deskr) {
        this.id = id;
        this.img = img;
        this.penerbit = penerbit;
        this.author = author;
        this.deskr = deskr;
    }
    
     public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDeskr(String deskr) {
        this.deskr = deskr;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getAuthor() {
        return author;
    }

    public String getDeskr() {
        return deskr;
    }

   
    
    
}
