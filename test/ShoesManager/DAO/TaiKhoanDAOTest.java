/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.TaiKhoanDTO;
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
public class TaiKhoanDAOTest {
    
    public TaiKhoanDAOTest() {
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
     * Test of docDB method, of class TaiKhoanDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        String orderBy = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        ArrayList<TaiKhoanDTO> expResult = null;
        ArrayList<TaiKhoanDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class TaiKhoanDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        ArrayList<TaiKhoanDTO> expResult = null;
        ArrayList<TaiKhoanDTO> result = instance.docDB(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class TaiKhoanDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB");
        TaiKhoanDAO instance = new TaiKhoanDAO();
        ArrayList<TaiKhoanDTO> expResult = null;
        ArrayList<TaiKhoanDTO> result = instance.docDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of them method, of class TaiKhoanDAO.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        TaiKhoanDTO tk = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        Boolean expResult = null;
        Boolean result = instance.them(tk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of xoa method, of class TaiKhoanDAO.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        TaiKhoanDTO tk = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        Boolean expResult = null;
        Boolean result = instance.xoa(tk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sua method, of class TaiKhoanDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        TaiKhoanDTO tk = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        Boolean expResult = null;
        Boolean result = instance.sua(tk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
