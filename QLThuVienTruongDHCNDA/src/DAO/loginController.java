/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectToSQL.DataSQL;
import DTO.ADMIN;
import DTO.NhanVien;
import INTERFACE.LoginDAO;
import image.loginDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
    
public class loginController implements LoginDAO{
    
   
   public  int check(String TenDangNhap , String MatKhau) throws SQLException{
       Connection conn = DataSQL.getConnection();
        Statement st1 = conn.createStatement();
        Statement st2 = conn.createStatement();
        ResultSet re1 = st1.executeQuery("select * from NhanVienQLMT where TenDangNhap = '"+TenDangNhap+"' AND MatKhau='"+MatKhau+"'");
        ResultSet re2 = st2.executeQuery("select * from NhanVienQLTL where TenDangNhap = '"+TenDangNhap+"' AND MatKhau='"+MatKhau+"'");
        Statement st = conn.createStatement();        
        ResultSet re = st.executeQuery("select * from ADmin where TenDangNhap = '"+TenDangNhap+"' AND MatKhau='"+MatKhau+"'");
        if(re.next())
            return  1;
        else if(re1.next())
            return 2;
        else if(re2.next())
            return 3;
        else
            return 0;
   }
}
