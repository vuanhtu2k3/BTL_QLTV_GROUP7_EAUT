/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectToSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anh Tu
 */
public class DataSQL {
    public Connection con=null;

    public static  Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien3;"
                        + "user =sa;password = 123456;encrypt = false");
            } catch (SQLException ex) {
                Logger.getLogger(DataSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(DataSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return null;
    }
}
