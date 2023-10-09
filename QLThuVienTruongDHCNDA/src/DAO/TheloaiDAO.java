/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectToSQL.DataSQL;
import DTO.TheLoai;
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
public class TheloaiDAO implements iQueryDatabase{
     public static void TheQuery(String sql) throws SQLException {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
    public static ArrayList<TheLoai> List = new ArrayList<>();
    public static ArrayList<TheLoai> List1 = new ArrayList<>();
    public static ArrayList<TheLoai> HienThi() throws Exception {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        ResultSet re = st.executeQuery("select * from TheLoai ");

        List.removeAll(List);
        while (re.next()) {
            String MaTheLoai = re.getString("MaTheLoai");
            String TenTheLoai = re.getString("TenTheLoai");
            TheLoai x = new TheLoai(MaTheLoai,TenTheLoai);
            List.add(x);
        }

        return List;

    }
     public static void ThemTheLoai(TheLoai tl ) throws SQLException {
        Connection conn = DataSQL.getConnection();
        String sql = "insert into TheLoai(MaTheLoai, TenTheLoai) "
                + "values(?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tl.getMaTheLoai());
        ps.setString(2, tl.getTenTheLoai());
        ps.executeUpdate();
        
    }
  public static void XoaTheLoai(String MaTheLoai) throws SQLException {
        String sql = "delete from TheLoai where MaTheLoai= '" + MaTheLoai + "'";
        TheQuery(sql);
    }
}
