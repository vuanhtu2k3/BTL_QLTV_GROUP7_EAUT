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
public class BanDocTest {
    
    public BanDocTest() {
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
     * Test of hashCode method, of class BanDoc.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BanDoc instance = new BanDoc();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class BanDoc.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        BanDoc instance = new BanDoc();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaBanDoc method, of class BanDoc.
     */
    @Test
    public void testGetMaBanDoc() {
        
        BanDoc instance = new BanDoc();
        String expResult = "";
        String result = instance.getMaBanDoc();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaBanDoc method, of class BanDoc.
     */
    @Test
    public void testSetMaBanDoc() {
     
        String MaBanDoc = "BD0001";
        BanDoc instance = new BanDoc();
        instance.setMaBanDoc(MaBanDoc);
        String expected = "BD0001";
        assertEquals(expected, instance.getMaBanDoc());
    }

    /**
     * Test of getTenBanDoc method, of class BanDoc.
     */
    @Test
    public void testGetTenBanDoc() {
        System.out.println("getTenBanDoc");
        BanDoc instance = new BanDoc();
        String expResult = "";
        String result = instance.getTenBanDoc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenBanDoc method, of class BanDoc.
     */
    @Test
    public void testSetTenBanDoc() {
        System.out.println("setTenBanDoc");
        String TenBanDoc = "";
        BanDoc instance = new BanDoc();
        instance.setTenBanDoc(TenBanDoc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKhoa method, of class BanDoc.
     */
    @Test
    public void testGetKhoa() {
        System.out.println("getKhoa");
        BanDoc instance = new BanDoc();
        String expResult = "";
        String result = instance.getKhoa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKhoa method, of class BanDoc.
     */
    @Test
    public void testSetKhoa() {
        System.out.println("setKhoa");
        String Khoa = "";
        BanDoc instance = new BanDoc();
        instance.setKhoa(Khoa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGioiTinh method, of class BanDoc.
     */
    @Test
    public void testGetGioiTinh() {
        System.out.println("getGioiTinh");
        BanDoc instance = new BanDoc();
        String expResult = "";
        String result = instance.getGioiTinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGioiTinh method, of class BanDoc.
     */
    @Test
    public void testSetGioiTinh() {
        System.out.println("setGioiTinh");
        String GioiTinh = "";
        BanDoc instance = new BanDoc();
        instance.setGioiTinh(GioiTinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgaySinh method, of class BanDoc.
     */
    @Test
    public void testGetNgaySinh() {
        System.out.println("getNgaySinh");
        BanDoc instance = new BanDoc();
        Date expResult = null;
        Date result = instance.getNgaySinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgaySinh method, of class BanDoc.
     */
    @Test
    public void testSetNgaySinh() {
        System.out.println("setNgaySinh");
        Date NgaySinh = null;
        BanDoc instance = new BanDoc();
        instance.setNgaySinh(NgaySinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoDienThoai method, of class BanDoc.
     */
    @Test
    public void testGetSoDienThoai() {
        
        BanDoc instance = new BanDoc();
        int expResult = 0;
        int result = instance.getSoDienThoai();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSoDienThoai method, of class BanDoc.
     */
    @Test
    public void testSetSoDienThoai() {
      
        int SoDienThoai = 0;
        BanDoc instance = new BanDoc();
        instance.setSoDienThoai(SoDienThoai);
        
    }
public void testSetSoDienThoaiWithNegative() {
      
        int SoDienThoai = -034115;
        BanDoc instance = new BanDoc();
        instance.setSoDienThoai(SoDienThoai);
          Exception ex = assertThrows(Exception.class, ()->instance.setSoDienThoai(SoDienThoai));
        
    }
    /**
     * Test of toString method, of class BanDoc.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BanDoc instance = new BanDoc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
