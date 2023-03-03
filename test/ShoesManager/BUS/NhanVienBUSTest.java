/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.NhanVienDTO;
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
public class NhanVienBUSTest {
    
    public NhanVienBUSTest() {
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
     * Test of them method, of class NhanVienBUS.
     */
    @Test
    public void testThem() throws Exception {
        //Lỗi vì thiếu field chức vụ
        System.out.println("them");
        NhanVienDTO expResult = new NhanVienDTO("datisekai", "abc", "abc", "abc", "abc", "abc", "abc", 0, 0, "abc");
        NhanVienBUS instance = new NhanVienBUS();
        instance.them(expResult);
        NhanVienDTO actualResult = instance.getNhanVien_MaNV("datisekai");
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class NhanVienBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        String maNV = "id5";
        NhanVienBUS instance = new NhanVienBUS();
        NhanVienDTO nv = instance.getNhanVien_MaNV(maNV);
        
        NhanVienDTO expResult = null;
        instance.xoa(nv);
        NhanVienDTO actualResult = instance.getNhanVien_MaNV(maNV);
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class NhanVienBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        String expResultEmail = "admin@gmail.com";//old admin@admin.vn
        NhanVienBUS instance = new NhanVienBUS();
        NhanVienDTO nv = instance.getNhanVien_MaNV("admin");
        nv.setStrEmail(expResultEmail);
        
        instance.sua(nv);
        NhanVienDTO actualResult = instance.getNhanVien_MaNV("admin");
        assertEquals(expResultEmail, actualResult.getStrEmail());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNhanVien_MaNV method, of class NhanVienBUS.
     */
    @Test
    public void testGetNhanVien_MaNV() throws Exception {
        System.out.println("getNhanVien_MaNV");
        String strMaNV = "admin";
        NhanVienBUS instance = new NhanVienBUS();
        String expResultEmail = "admin@admin.vn";
        NhanVienDTO actualResult = instance.getNhanVien_MaNV(strMaNV);
        assertEquals(expResultEmail, actualResult.getStrEmail());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
