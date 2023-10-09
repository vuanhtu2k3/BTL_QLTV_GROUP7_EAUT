/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.loginController;
import INTERFACE.LoginDAO;
import image.loginDAO;
import java.sql.SQLException;

/**
 *
 * @author Anh Tu
 */
public class Login implements LoginDAO{
private loginController hsst;

    public Login() {
        // Khởi tạo thể hiện của HangDAO hoặc lớp khác mà bạn muốn sử dụng ở đây
        this.hsst = new loginController(); // Ví dụ: sử dụng HangDAO
    }
    
    @Override
    public int check(String TenDangNhap, String MatKhau) throws SQLException {
       return hsst.check(TenDangNhap, MatKhau);
    }
    
}
