/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.KhachHangDTO;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author haidu
 */
public class KhachHangDAOTest {
    
    public KhachHangDAOTest() {
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
     * Test of docDB method, of class KhachHangDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB1");
        String condition = "1";
        String orderBy = "1";
        KhachHangDAO instance = new KhachHangDAO();
        ArrayList<KhachHangDTO> expResult = instance.docDB("1", "1");
        ArrayList<KhachHangDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class KhachHangDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB2");
        String condition = "1";
        KhachHangDAO instance = new KhachHangDAO();
        ArrayList<KhachHangDTO> expResult = instance.docDB("1");
        ArrayList<KhachHangDTO> result = instance.docDB(condition);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class KhachHangDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB3");
        KhachHangDAO instance = new KhachHangDAO();
        ArrayList<KhachHangDTO> expResult = instance.docDB();
        ArrayList<KhachHangDTO> result = instance.docDB();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class KhachHangDAO.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        KhachHangDTO kh = new KhachHangDTO("KH7", "Nguyễn Hải", "Dương", "Nam", "2013/1 kp6", "abc@gmail.com", "vip", 1231231);
        KhachHangDAO instance = new KhachHangDAO();
        Boolean expResult = true;
        Boolean result = instance.them(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class KhachHangDAO.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        KhachHangDTO kh = new KhachHangDTO("KH7", "Nguyễn Hải", "Dương", "Nam", "2013/1 kp6", "abc@gmail.com", "vip", 1231231);
        KhachHangDAO instance = new KhachHangDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class KhachHangDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        KhachHangDTO kh = new KhachHangDTO("KH7", "Nguyễn Hải", "Dương", "Nam", "2013/1 kp656", "abc@gmail.com", "vip", 1231231);
        KhachHangDAO instance = new KhachHangDAO();
        Boolean expResult = true;
        Boolean result = instance.sua(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
