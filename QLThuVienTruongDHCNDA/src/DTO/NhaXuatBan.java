/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Anh Tu
 */
public class NhaXuatBan extends Person{
    String MaNhaXuatBan, TenNhaXuatBan;

    public String getMaNhaXuatBan() {
        return MaNhaXuatBan;
    }

    public String getTenNhaXuatBan() {
        return TenNhaXuatBan;
    }

    public void setMaNhaXuatBan(String MaNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

    public void setTenNhaXuatBan(String TenNhaXuatBan) {
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

    public NhaXuatBan(String MaNhaXuatBan, String TenNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

    public NhaXuatBan() {
    }

    @Override
    public String toString() {
        return "NhaXuatBan{" + "MaNhaXuatBan=" + MaNhaXuatBan + ", TenNhaXuatBan=" + TenNhaXuatBan + '}';
    }
    
}
