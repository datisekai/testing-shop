/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.TaiKhoanDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author datly
 */
public class TaiKhoanBUSTest {
    
    public TaiKhoanBUSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of them method, of class TaiKhoanBUS.
     */
    @Test
    public void testThem() throws Exception {
        //Chưa validate các trường dữ liệu đầu vào.
        System.out.println("them");
        TaiKhoanDTO tk = new TaiKhoanDTO("id5", "abc", 0);
        TaiKhoanBUS instance = new TaiKhoanBUS();
        Boolean expResult = false;
        Boolean result = instance.them(tk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class TaiKhoanBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        String tenDangNhap = "id5";
        TaiKhoanDTO tk = new TaiKhoanDTO(tenDangNhap, "abc", 0);
        TaiKhoanBUS instance = new TaiKhoanBUS();
        int expResult = -1;
        int actualResult = instance.getCapBac_Ten(tenDangNhap);
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class TaiKhoanBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        int expResult = 3;
        String tenDangNhap = "id1";
        TaiKhoanDTO tk = new TaiKhoanDTO(tenDangNhap, "admin", expResult);
        TaiKhoanBUS instance = new TaiKhoanBUS();
        instance.sua(tk);
        int actualResult = instance.getCapBac_Ten(tenDangNhap);
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of kiemTraDangNhap method, of class TaiKhoanBUS.
     */
    @Test
    public void testKiemTraDangNhap() throws Exception {
        System.out.println("kiemTraDangNhap");
        TaiKhoanDTO tk = new TaiKhoanDTO("admin", "admin", 0);
        TaiKhoanBUS instance = new TaiKhoanBUS();
        Boolean expResult = true;
        Boolean result = instance.kiemTraDangNhap(tk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCapBac_Ten method, of class TaiKhoanBUS.
     */
    @Test
    public void testGetCapBac_Ten() throws Exception {
        System.out.println("getCapBac_Ten");
        String strTen = "admin";
        TaiKhoanBUS instance = new TaiKhoanBUS();
        int expResult = 1;
        int result = instance.getCapBac_Ten(strTen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
