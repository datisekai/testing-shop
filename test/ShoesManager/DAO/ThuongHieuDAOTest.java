/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.ThuongHieuDTO;
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
public class ThuongHieuDAOTest {
    
    public ThuongHieuDAOTest() {
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
     * Test of docDB method, of class ThuongHieuDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        String orderBy = "";
        ThuongHieuDAO instance = new ThuongHieuDAO();
        ArrayList<ThuongHieuDTO> expResult = null;
        ArrayList<ThuongHieuDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class ThuongHieuDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        ThuongHieuDAO instance = new ThuongHieuDAO();
        ArrayList<ThuongHieuDTO> expResult = null;
        ArrayList<ThuongHieuDTO> result = instance.docDB(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class ThuongHieuDAO.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");
        ThuongHieuDAO instance = new ThuongHieuDAO();
        ArrayList<ThuongHieuDTO> expResult = null;
        ArrayList<ThuongHieuDTO> result = instance.docDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
