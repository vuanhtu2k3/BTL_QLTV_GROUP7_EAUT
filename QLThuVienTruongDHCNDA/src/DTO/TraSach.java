/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Anh Tu
 */
public class TraSach {
    String MaMuon,MaPhieu;
    int SoLuong;
    Date NgayMuon, NgayTra;

    public String getMaMuon() {
        return MaMuon;
    }

    public String getMaPhieu() {
        return MaPhieu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setMaMuon(String MaMuon) {
        this.MaMuon = MaMuon;
    }

    public void setMaPhieu(String MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public TraSach(String MaMuon, String MaPhieu, int SoLuong, Date NgayMuon, Date NgayTra) {
        this.MaMuon = MaMuon;
        this.MaPhieu = MaPhieu;
        this.SoLuong = SoLuong;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
    }

    public TraSach() {
    }

    @Override
    public String toString() {
        return "TraSach{" + "MaMuon=" + MaMuon + ", MaPhieu=" + MaPhieu + ", SoLuong=" + SoLuong + ", NgayMuon=" + NgayMuon + ", NgayTra=" + NgayTra + '}';
    }

    
}
