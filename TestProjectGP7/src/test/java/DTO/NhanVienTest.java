/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DTO;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anh Tu
 */
public class NhanVienTest {
    
    public NhanVienTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of hashCode method, of class NhanVien.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        NhanVien instance = new NhanVien();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class NhanVien.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaiKhoan method, of class NhanVien.
     */
    @Test
    public void testGetTaiKhoan() {
        System.out.println("getTaiKhoan");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getTaiKhoan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaiKhoan method, of class NhanVien.
     */
    @Test
    public void testSetTaiKhoan() {
        System.out.println("setTaiKhoan");
        String TaiKhoan = "";
        NhanVien instance = new NhanVien();
        instance.setTaiKhoan(TaiKhoan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatKhau method, of class NhanVien.
     */
    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatKhau method, of class NhanVien.
     */
    @Test
    public void testSetMatKhau() {
        System.out.println("setMatKhau");
        String MatKhau = "";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(MatKhau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaNhanVien method, of class NhanVien.
     */
    @Test
    public void testGetMaNhanVien() {
        
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMaNhanVien();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMaNhanVien method, of class NhanVien.
     */
    @Test
    public void testSetMaNhanVien() {
        
        String MaNhanVien = "NVQLMT9";
        NhanVien instance = new NhanVien();
        instance.setMaNhanVien(MaNhanVien);
        String expected = "NVQLMT9";
        assertEquals(expected, instance.getMaNhanVien());
    }

    /**
     * Test of getTenNhanVien method, of class NhanVien.
     */
    @Test
    public void testGetTenNhanVien() {
        System.out.println("getTenNhanVien");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getTenNhanVien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenNhanVien method, of class NhanVien.
     */
    @Test
    public void testSetTenNhanVien() {
        System.out.println("setTenNhanVien");
        String TenNhanVien = "";
        NhanVien instance = new NhanVien();
        instance.setTenNhanVien(TenNhanVien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiaChi method, of class NhanVien.
     */
    @Test
    public void testGetDiaChi() {
        System.out.println("getDiaChi");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiaChi method, of class NhanVien.
     */
    @Test
    public void testSetDiaChi() {
        System.out.println("setDiaChi");
        String DiaChi = "";
        NhanVien instance = new NhanVien();
        instance.setDiaChi(DiaChi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGioiTinh method, of class NhanVien.
     */
    @Test
    public void testGetGioiTinh() {
        System.out.println("getGioiTinh");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getGioiTinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGioiTinh method, of class NhanVien.
     */
    @Test
    public void testSetGioiTinh() {
        System.out.println("setGioiTinh");
        String GioiTinh = "";
        NhanVien instance = new NhanVien();
        instance.setGioiTinh(GioiTinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoDienThoai method, of class NhanVien.
     */
    @Test
    public void testGetSoDienThoai() {
        System.out.println("getSoDienThoai");
        NhanVien instance = new NhanVien();
        int expResult = 0;
        int result = instance.getSoDienThoai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoDienThoai method, of class NhanVien.
     */
    @Test
    public void testSetSoDienThoai() {
        System.out.println("setSoDienThoai");
        int SoDienThoai = 0;
        NhanVien instance = new NhanVien();
        instance.setSoDienThoai(SoDienThoai);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgaySinh method, of class NhanVien.
     */
    @Test
    public void testGetNgaySinh() {
        System.out.println("getNgaySinh");
        NhanVien instance = new NhanVien();
        Date expResult = null;
        Date result = instance.getNgaySinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgaySinh method, of class NhanVien.
     */
    @Test
    public void testSetNgaySinh() {
        System.out.println("setNgaySinh");
        Date NgaySinh = null;
        NhanVien instance = new NhanVien();
        instance.setNgaySinh(NgaySinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class NhanVien.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
