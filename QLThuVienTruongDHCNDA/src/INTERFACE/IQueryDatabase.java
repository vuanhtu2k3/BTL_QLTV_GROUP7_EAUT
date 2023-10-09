/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACE;

import DTO.BanDoc;
import DTO.NhanVien;
import DTO.Phieu;
import DTO.TaiLieu;
import DTO.XuLyQuaHan;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Anh Tu
 */
public interface IQueryDatabase {

    void TheQuery(String sql) throws SQLException;

    boolean isDateValid(String date);

    boolean CheckTime(String date);

    void ThemBanDoc(BanDoc tl) throws SQLException;

    void XoaBanDoc(String MaBanDoc) throws SQLException;

    void SuaBanDoc(BanDoc tl) throws SQLException;

    ArrayList<BanDoc> HienThi() throws Exception;

    boolean Check(String Mabd) throws SQLException;

    boolean CheckKhoaNgoai(String Mabd) throws SQLException;

    ArrayList<BanDoc> TimKiemMaSV(String Masv) throws Exception;

    ArrayList<BanDoc> TimKiemTenSV(String Matl) throws Exception;

    ArrayList<TaiLieu> LayMaP() throws Exception;

    String LayTenBD(String MaBD) throws Exception;

    ArrayList<TaiLieu> LayMaTL() throws Exception;

    void ThemPhieu(Phieu tl) throws SQLException;

    ArrayList<Phieu> HTQuaHan() throws Exception;

    void SuaPhieu(Phieu tl) throws SQLException;

    boolean CheckKhoaNgoai(String Matl, String Mabd) throws SQLException;

    void XoaPhieu(String MaNV) throws SQLException;

    ArrayList<Phieu> TimMaPhieu(String s) throws Exception;

    ArrayList<Phieu> TimMaSV(String s) throws Exception;

    ArrayList<Phieu> TimMaTaiLieu(String s) throws Exception;

    ArrayList<Phieu> TimTenSV(String s) throws Exception;

    ArrayList<TaiLieu> LayTenTheLoai() throws Exception;

    ArrayList<TaiLieu> LayTenNhaXuatBan() throws Exception;

    void ThemNhanVienQLMT(NhanVien tl) throws SQLException;

    void ThemNhanVienQLTL(NhanVien tl) throws SQLException;

    boolean Check(String Matl, String Tentk) throws SQLException;

    boolean Check1(String Matl, String Tentk) throws SQLException;

    ArrayList<NhanVien> HienThiNVQLMT() throws Exception;

    ArrayList<NhanVien> HienThiNVQLTL() throws Exception;

    ArrayList<NhanVien> TimKiemMaNV(String s) throws Exception;

    ArrayList<NhanVien> TimKiemTenNV(String s) throws Exception;

    ArrayList<NhanVien> TimKiemTenTK(String s) throws Exception;

    void SuaNhanVienQLMT(NhanVien tl) throws SQLException;

    void SuaNhanVienQLTL(NhanVien tl) throws SQLException;

    void XoaNhanvienQLMT(String MaNV) throws SQLException;

    void XoaNhanvienQLTL(String MaNV) throws SQLException;

    void ThemTaiLieu(TaiLieu tl) throws SQLException;

    void XoaTaiLieu(String MaTaiLieu) throws SQLException;

    void SuaTaiLieu(TaiLieu tl) throws SQLException;

    void Them(XuLyQuaHan tl) throws SQLException;

    void SuaXuLy(XuLyQuaHan tl) throws SQLException;

    ArrayList<XuLyQuaHan> TimKiemMaXuLy(String Maxl) throws Exception;

    ArrayList<XuLyQuaHan> TimKiemMaPhieu(String Maxl) throws Exception;

    ArrayList<TaiLieu> TimKiemMaTL(String Matl) throws Exception;

    ArrayList<TaiLieu> TimKiemTenTL(String Matl) throws Exception;

    ArrayList<TaiLieu> TimKiemTacGia(String Matl) throws Exception;
}
