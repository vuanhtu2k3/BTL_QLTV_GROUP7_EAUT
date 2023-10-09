/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Anh Tu
 */
public class TheLoai {
    String MaTheLoai, TenTheLoai;

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }

    public TheLoai(String MaTheLoai, String TenTheLoai) {
        this.MaTheLoai = MaTheLoai;
        this.TenTheLoai = TenTheLoai;
    }

    public TheLoai() {
    }

    @Override
    public String toString() {
        return "TheLoai{" + "MaTheLoai=" + MaTheLoai + ", TenTheLoai=" + TenTheLoai + '}';
    }
    
}
