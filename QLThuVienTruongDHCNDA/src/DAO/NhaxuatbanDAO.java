/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectToSQL.DataSQL;
import DTO.NhaXuatBan;
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
public class NhaxuatbanDAO implements iQueryDatabase{
     public static void TheQuery(String sql) throws SQLException {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
     public static ArrayList<NhaXuatBan> List = new ArrayList<>();
    public static ArrayList<NhaXuatBan> List1 = new ArrayList<>();
    public static ArrayList<NhaXuatBan> HienThi() throws Exception {
        Connection conn = DataSQL.getConnection();
        Statement st = conn.createStatement();
        ResultSet re = st.executeQuery("select * from NhaXuatBan ");

        List.removeAll(List);
        while (re.next()) {
            String MaNhaXuatBan = re.getString("MaNhaXuatBan");
            String TenNhaXuatBan = re.getString("TenNhaXuatBan");
            NhaXuatBan x = new NhaXuatBan(MaNhaXuatBan,TenNhaXuatBan);
            List.add(x);
        }

        return List;

    }
    public static void ThemNhaXuatBan(NhaXuatBan tl ) throws SQLException {
        Connection conn = DataSQL.getConnection();
        String sql = "insert into NhaXuatBan(MaNhaXuatBan, TenNhaXuatBan) "
                + "values(?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tl.getMaNhaXuatBan());
        ps.setString(2, tl.getTenNhaXuatBan());
        ps.executeUpdate();
        
    }
  public static void XoaNhaXuatBan(String MaNhaXuatBan) throws SQLException {
        String sql = "delete from NhaXuatBan where MaNhaXuatBan = '" + MaNhaXuatBan + "'";
        TheQuery(sql);
    }
}
