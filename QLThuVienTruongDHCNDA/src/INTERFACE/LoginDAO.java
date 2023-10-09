/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACE;

import java.sql.SQLException;

/**
 *
 * @author Anh Tu
 */
public interface LoginDAO {
  int check(String TenDangNhap , String MatKhau) throws SQLException;
}
