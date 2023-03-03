/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.SanPhamDTO;
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
public class SanPhamDAOTest {
    
    public SanPhamDAOTest() {
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
     * Test of docDB method, of class SanPhamDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        String orderBy = "";
        SanPhamDAO instance = new SanPhamDAO();
        ArrayList<SanPhamDTO> expResult = null;
        ArrayList<SanPhamDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class SanPhamDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        SanPhamDAO instance = new SanPhamDAO();
        ArrayList<SanPhamDTO> expResult = null;
        ArrayList<SanPhamDTO> result = instance.docDB(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class SanPhamDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB");
        SanPhamDAO instance = new SanPhamDAO();
        ArrayList<SanPhamDTO> expResult = null;
        ArrayList<SanPhamDTO> result = instance.docDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of them method, of class SanPhamDAO.
     */
    @Test
    public void testThem() throws Exception {
        SanPhamDTO hd = new SanPhamDTO("SP7", "", "","", "3", "US", "WT","AD", 0, 0, 0);
        SanPhamDAO instance = new SanPhamDAO();
        Boolean expResult = true;
        Boolean result = instance.them(hd);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of xoa method, of class SanPhamDAO.
     */
    @Test
    public void testXoa() throws Exception {
        SanPhamDTO hd = new SanPhamDTO("SP6", "Dép Lê", "Nam","Nam", "", "US", "WT","AD", 0, 0, 0);
        SanPhamDAO instance = new SanPhamDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(hd);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sua method, of class SanPhamDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        SanPhamDTO hd = null;
        SanPhamDAO instance = new SanPhamDAO();
        Boolean expResult = null;
        Boolean result = instance.sua(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
