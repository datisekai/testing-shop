/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.NhanVienDTO;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class NhanVienDAOTest {
    
    public NhanVienDAOTest() {
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
     * Test of docDB method, of class NhanVienDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        String orderBy = "";
        NhanVienDAO instance = new NhanVienDAO();
        ArrayList<NhanVienDTO> expResult = null;
        ArrayList<NhanVienDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class NhanVienDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        NhanVienDAO instance = new NhanVienDAO();
        ArrayList<NhanVienDTO> expResult = null;
        ArrayList<NhanVienDTO> result = instance.docDB(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class NhanVienDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB");
        NhanVienDAO instance = new NhanVienDAO();
        ArrayList<NhanVienDTO> expResult = null;
        ArrayList<NhanVienDTO> result = instance.docDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of them method, of class NhanVienDAO.
     */
    @Test
    public void testThem() throws Exception {
        NhanVienDTO nv = new NhanVienDTO("id5","Nguyễn Thị Lê", "Kim", "Nữ", "13 An Mà,P LA,Q DHA,TpHCM","nguyenthilekim@gmail", "", 123456789, 900, "girl 2");
//        nv.setstrMaNV("a");
//        nv.setStrHo("a");
//        nv.setStrTen("a");
//        nv.setStrGioiTinh("a");
//        nv.setStrDiaChi("a");
//        nv.setStrEmail("a");
//        nv.setStrChucVu("a");
//        nv.setiDienThoai(0);
//        nv.setiLuong(0);
//        nv.setStrAnh("a");
        NhanVienDAO instance = new NhanVienDAO();
        Boolean expResult = true;
        Boolean result = instance.them(nv);
        assertEquals(expResult, result);
    }

    /**
     * Test of xoa method, of class NhanVienDAO.
     */
    @Test
    public void testXoa() throws Exception {
//        NhanVienDTO nv = new NhanVienDTO();
//        nv.setstrMaNV("");
//        nv.setStrHo("");
//        nv.setStrTen("");
//        nv.setStrGioiTinh("");
//        nv.setStrDiaChi("");
//        nv.setStrEmail("");
//        nv.setStrChucVu("");
//        nv.setiDienThoai(0);
//        nv.setiLuong(0);
//        nv.setStrAnh("");
        NhanVienDTO nv = new NhanVienDTO("id5","Nguyễn Thị Lê", "Kim", "Nữ", "13 An Mà,P LA,Q DHA,TpHCM","nguyenthilekim@gmail", "Hóa Đơn", 123456789, 900, "girl 2");
        NhanVienDAO instance = new NhanVienDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(nv);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of sua method, of class NhanVienDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        NhanVienDTO nv = null;
        NhanVienDAO instance = new NhanVienDAO();
        Boolean expResult = null;
        Boolean result = instance.sua(nv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
