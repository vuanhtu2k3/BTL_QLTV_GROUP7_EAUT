/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectToSQL.DataSQL;
import DTO.Tacgia;
import java.lang.ref.Reference;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import image.iQueryDatabase;

/**
 *
 * @author Anh Tu
 */
public class TacGiaDAO implements iQueryDatabase{
     public static void TheQuery(String sql) throws SQLException {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
    public static ArrayList<Tacgia> List = new ArrayList<>();
    public static ArrayList<Tacgia> List1 = new ArrayList<>();
    public static ArrayList<Tacgia> HienThi() throws Exception {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        ResultSet re = st.executeQuery("select * from TacGia ");

        List.removeAll(List);
        while (re.next()) {
            String MaTacgia = re.getString("MaTacGia");
            String TenTacgia = re.getString("TenTacgia");
            Tacgia x = new Tacgia(MaTacgia, TenTacgia);
            List.add(x);
        }

        return null;

    }
  public static void ThemTacGia(Tacgia tl ) throws SQLException {
        Connection conn = DataSQL.getConnection();
        String sql = "insert into TacGia(MaTacGia, TenTacGia) "
                + "values(?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tl.getMaTacGia());
        ps.setString(2, tl.getTenTacGia());
        ps.executeUpdate();
        
    }
  public static void XoaTacGia(String MaTacGia) throws SQLException {
        String sql = "delete from TacGia where MaTacGia = '" + MaTacGia + "'";
        TheQuery(sql);
    }
}
