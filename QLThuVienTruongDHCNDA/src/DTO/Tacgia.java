package DTO;

/**
 *
 * @author Anh Tu
 */
public class Tacgia extends Person{
    String MaTacGia, TenTacGia;

    public String getMaTacGia() {
        return MaTacGia;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setMaTacGia(String MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public Tacgia(String MaTacGia, String TenTacGia) {
        this.MaTacGia = MaTacGia;
        this.TenTacGia = TenTacGia;
    }

    public Tacgia() {
    }

    @Override
    public String toString() {
        return "Tacgia{" + "MaTacGia=" + MaTacGia + ", TenTacGia=" + TenTacGia + '}';
    }
    
}