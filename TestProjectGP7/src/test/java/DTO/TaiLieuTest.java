/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DTO;

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
public class TaiLieuTest {
    
    public TaiLieuTest() {
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
     * Test of getViTri method, of class TaiLieu.
     */
    @Test
    public void testGetViTri() {
        System.out.println("getViTri");
        TaiLieu instance = new TaiLieu();
        String expResult = "";
        String result = instance.getViTri();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setViTri method, of class TaiLieu.
     */
    @Test
    public void testSetViTri() {
        System.out.println("setViTri");
        String ViTri = "";
        TaiLieu instance = new TaiLieu();
        instance.setViTri(ViTri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaTaiLieu method, of class TaiLieu.
     */
    @Test
    public void testGetMaTaiLieu() {
        
        TaiLieu instance = new TaiLieu();
        String expResult = "";
        String result = instance.getMaTaiLieu();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMaTaiLieu method, of class TaiLieu.
     */
    @Test
    public void testSetMaTaiLieu() {
       
        String MaTaiLieu = "TL1";
        TaiLieu instance = new TaiLieu();
        instance.setMaTaiLieu(MaTaiLieu);
       String expected = "TL1";
        assertEquals(expected, instance.getMaTaiLieu());
    }

    /**
     * Test of getTenTaiLieu method, of class TaiLieu.
     */
    @Test
    public void testGetTenTaiLieu() {
        System.out.println("getTenTaiLieu");
        TaiLieu instance = new TaiLieu();
        String expResult = "";
        String result = instance.getTenTaiLieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenTaiLieu method, of class TaiLieu.
     */
    @Test
    public void testSetTenTaiLieu() {
        System.out.println("setTenTaiLieu");
        String TenTaiLieu = "";
        TaiLieu instance = new TaiLieu();
        instance.setTenTaiLieu(TenTaiLieu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTheLoai method, of class TaiLieu.
     */
    @Test
    public void testGetTheLoai() {
        System.out.println("getTheLoai");
        TaiLieu instance = new TaiLieu();
        String expResult = "";
        String result = instance.getTheLoai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheLoai method, of class TaiLieu.
     */
    @Test
    public void testSetTheLoai() {
        System.out.println("setTheLoai");
        String TheLoai = "";
        TaiLieu instance = new TaiLieu();
        instance.setTheLoai(TheLoai);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNhaXuatBan method, of class TaiLieu.
     */
    @Test
    public void testGetNhaXuatBan() {
        System.out.println("getNhaXuatBan");
        TaiLieu instance = new TaiLieu();
        String expResult = "";
        String result = instance.getNhaXuatBan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNhaXuatBan method, of class TaiLieu.
     */
    @Test
    public void testSetNhaXuatBan() {
        System.out.println("setNhaXuatBan");
        String NhaXuatBan = "";
        TaiLieu instance = new TaiLieu();
        instance.setNhaXuatBan(NhaXuatBan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTenTacGia method, of class TaiLieu.
     */
    @Test
    public void testGetTenTacGia() {
        System.out.println("getTenTacGia");
        TaiLieu instance = new TaiLieu();
        String expResult = "";
        String result = instance.getTenTacGia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTacGia method, of class TaiLieu.
     */
    @Test
    public void testSetTacGia() {
        System.out.println("setTacGia");
        String TenTacGia = "";
        TaiLieu instance = new TaiLieu();
        instance.setTacGia(TenTacGia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoLuongCo method, of class TaiLieu.
     */
    @Test
    public void testGetSoLuongCo() {
        
        TaiLieu instance = new TaiLieu();
        int expResult = 0;
        int result = instance.getSoLuongCo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSoLuongCo method, of class TaiLieu.
     */
    @Test
    public void testSetSoLuongCo() {
     
        int SoLuongCo = 20;
        TaiLieu instance = new TaiLieu();
        instance.setSoLuongCo(SoLuongCo);
        int expected = 20;
        int result = instance.getSoLuongCo();
        assertEquals(expected, result);
    }
public void testSetSoLuongCoWithNegative() {
     
        int SoLuongCo = -20;
        TaiLieu instance = new TaiLieu();
        Exception ex = assertThrows(Exception.class, ()->instance.setSoLuongCo(SoLuongCo));
     
        
    }
    /**
     * Test of getNamXuatBan method, of class TaiLieu.
     */
    @Test
    public void testGetNamXuatBan() {
        System.out.println("getNamXuatBan");
        TaiLieu instance = new TaiLieu();
        int expResult = 0;
        int result = instance.getNamXuatBan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNamXuatBan method, of class TaiLieu.
     */
    @Test
    public void testSetNamXuatBan() {
        System.out.println("setNamXuatBan");
        int NamXuatBan = 0;
        TaiLieu instance = new TaiLieu();
        instance.setNamXuatBan(NamXuatBan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGiaSach method, of class TaiLieu.
     */
    @Test
    public void testGetGiaSach() {
        
        TaiLieu instance = new TaiLieu();
        float expResult = 0.0F;
        float result = instance.getGiaSach();
        assertEquals(expResult, result, 0);
        
    }
    @Test
    public void testSetGiaSach() {
       
        float GiaSach = 600;
        TaiLieu instance = new TaiLieu();
        instance.setGiaSach(GiaSach);
        float expected = 600;
        float result = instance.getGiaSach();
        assertEquals(expected, result,0.0);
        
    }
    @Test
 public void testSetGiaSachWithNegative() {
       
        float GiaSach = -600;
        TaiLieu instance = new TaiLieu();
        instance.setGiaSach(GiaSach);
        Exception exception =  assertThrows(Exception.class, ()->instance.setGiaSach(GiaSach));
            
    }
  public void testSetGiaSachWithLarge() {
       
        float GiaSach = (float) 600000000000d;
        TaiLieu instance = new TaiLieu();
        instance.setGiaSach(GiaSach);
        Exception exception =  assertThrows(Exception.class, ()->instance.setGiaSach(GiaSach));
            
    }
    /**
     * Test of toString method, of class TaiLieu.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TaiLieu instance = new TaiLieu();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class TaiLieu.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        TaiLieu instance = new TaiLieu();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class TaiLieu.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        TaiLieu instance = new TaiLieu();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
