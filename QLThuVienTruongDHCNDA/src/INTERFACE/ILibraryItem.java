/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACE;
  import java.util.Date;
/**
 *
 * @author Anh Tu
 */
public interface ILibraryItem {

    String getMaBanDoc();
    void setMaBanDoc(String MaBanDoc);
    
    String getTenBanDoc();
    void setTenBanDoc(String TenBanDoc);
    
    String getKhoa();
    void setKhoa(String Khoa);
    
    String getGioiTinh();
    void setGioiTinh(String GioiTinh);
    
    Date getNgaySinh();
    void setNgaySinh(Date NgaySinh);
    
    int getSoDienThoai();
    void setSoDienThoai(int SoDienThoai);
}


