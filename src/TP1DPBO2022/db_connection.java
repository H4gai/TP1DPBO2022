/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1DPBO2022;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hagai
 */
public class db_connection {
    public static Connection con;
    public static Statement stm;
    
    public void connect(){//untuk membuka koneksi ke database
        try {
            String url ="jdbc:mysql://localhost/db_tp1";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
    public DefaultTableModel readAuthor(){
        
        DefaultTableModel dataAuthor = null;
        try{
            Object[] column = {"No", "Images", "Nama", "Jumlah Buku"};
            connect();
            dataAuthor = new DefaultTableModel(null, column);
            String sql = "Select id,img,nama,juml from tabel_author";
            ResultSet res = stm.executeQuery(sql);
           
            while(res.next()){
                Object[] hasil = new Object[4];
                hasil[0] = res.getString("id");
                hasil[1] = res.getString("img");
                hasil[2] = res.getString("nama");
                hasil[3] = res.getString("juml");
                System.out.print(hasil[1]);
                dataAuthor.addRow(hasil);
            }
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
        
        return dataAuthor;
    }
    
    public DefaultTableModel readBuku(){
        
        DefaultTableModel dataBuku = null;
        try{
            Object[] column = {"No", "Images", "Penerbit", "Author", "Deskripsi"};
            connect();
            dataBuku = new DefaultTableModel(null, column);
            String sql = "Select id,img,penerbit,author,deskr from tabel_buku";
            ResultSet res = stm.executeQuery(sql);
           
            while(res.next()){
                Object[] hasil = new Object[5];
                hasil[0] = res.getString("id");
                hasil[1] = res.getString("img");
                hasil[2] = res.getString("penerbit");
                hasil[3] = res.getString("author");
                hasil[4] = res.getString("deskr");
                System.out.print(hasil[1]);
                dataBuku.addRow(hasil);
            }
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
        
        return dataBuku;
    }
    
    
    public void Query(String inputan){
        
        try{
            connect();
            String sql = inputan;
            stm.execute(sql);
            
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
        
    }
}

 
