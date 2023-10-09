/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectToSQL.DataSQL;
import DTO.TraSach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import image.iQueryDatabase;

/**
 *
 * @author Anh Tu
 */
public class TraSachDAO implements  iQueryDatabase{
    public static ArrayList<TraSach> List = new ArrayList<>();
    public static ArrayList<TraSach> List1 = new ArrayList<>();
    public static ArrayList<TraSach> HienThi() throws Exception {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        ResultSet re = st.executeQuery("select *from TraSach  ");
        List.removeAll(List);
        while(re.next()){
         String MaMuon = re.getString("MaMuon");
         String MaPhieu = re.getString("MaPhieu");
         int SoLuong = re.getInt("SoLuong");
         Date NgayMuon = re.getDate("NgayMuon");
         Date NgayTra = re.getDate("NgayTra");
         
         TraSach x = new TraSach(MaMuon, MaPhieu, SoLuong, NgayMuon, NgayTra);
         List.add(x);
        }
       
        return List;

    }
    public static void ThemTraSach(TraSach tl ) throws SQLException {
        Connection conn = DataSQL.getConnection();
        String sql = "insert into TraSach(MaMuon, MaPhieu, SoLuong, NgayMuon, NgayTra) "
                + "values(?,?,?,?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tl.getMaMuon());
        ps.setString(2, tl.getMaPhieu());
        ps.setInt(3, tl.getSoLuong());
        ps.setDate(4,new java.sql.Date(tl.getNgayMuon().getTime()) );
        ps.setDate(5,new java.sql.Date(tl.getNgayTra().getTime()) );

        ps.executeUpdate();
        
    }
   
     public static ArrayList<TraSach> TimMaTra(String s) throws Exception {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        ResultSet re = st.executeQuery("select * from TraSach where MaMuon like '"+s+"%' ");

        List1.removeAll(List1);
        while (re.next()) {
          String MaMuon = re.getString("MaMuon");
         String MaPhieu = re.getString("MaPhieu");
         int SoLuong = re.getInt("SoLuong");
         Date NgayMuon = re.getDate("NgayMuon");
         Date NgayTra = re.getDate("NgayTra");
         
         TraSach x = new TraSach(MaMuon, MaPhieu, SoLuong, NgayMuon, NgayTra);
         List.add(x);
        }

        return null;

    }
     public static ArrayList<TraSach> TimKiemMaSP(String MaMuon) throws Exception {
    Connection conn = DataSQL.getConnection();
    Statement st = conn.createStatement();
    ResultSet re = st.executeQuery("select MaMuon,MaPhieu, SoLuong, NgayMuon, NgayTra from TraSach where MaMuon like '" + MaMuon + "%' ");
    
    List1.removeAll(List1);
    while (re.next()) {
    
         String MaPhieu = re.getString("MaPhieu");
         int SoLuong = re.getInt("SoLuong");
         Date NgayMuon = re.getDate("NgayMuon");
         Date NgayTra = re.getDate("NgayTra");
         
         TraSach x = new TraSach(MaMuon, MaPhieu, SoLuong, NgayMuon, NgayTra);
         List.add(x);
        List1.add(x);
    }
    return List1;
}
    
    
}
