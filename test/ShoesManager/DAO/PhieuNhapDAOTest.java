/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.PhieuNhapDTO;
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
public class PhieuNhapDAOTest {
    
    public PhieuNhapDAOTest() {
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
     * Test of docDB method, of class PhieuNhapDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        String orderBy = "";
        PhieuNhapDAO instance = new PhieuNhapDAO();
        ArrayList<PhieuNhapDTO> expResult = null;
        ArrayList<PhieuNhapDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class PhieuNhapDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        PhieuNhapDAO instance = new PhieuNhapDAO();
        ArrayList<PhieuNhapDTO> expResult = null;
        ArrayList<PhieuNhapDTO> result = instance.docDB(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class PhieuNhapDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        PhieuNhapDAO instance = new PhieuNhapDAO();
        ArrayList<PhieuNhapDTO> result = instance.docDB();
        assertNotNull(result);
    }

    /**
     * Test of them method, of class PhieuNhapDAO.
     */
    @Test
    public void testThem() throws Exception {
        PhieuNhapDTO nv = new PhieuNhapDTO("", "", "id1", "", 900);
        PhieuNhapDAO instance = new PhieuNhapDAO();
        Boolean expResult = true;
        Boolean result =instance.them(nv);
        assertEquals(expResult, result);
    }

    /**
     * Test of xoa method, of class PhieuNhapDAO.
     */
    @Test
    public void testXoa() throws Exception {
        PhieuNhapDTO nv = new PhieuNhapDTO("", "", "id1", "", 900);
        PhieuNhapDAO instance = new PhieuNhapDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(nv);
        assertEquals(expResult, result);
    }

    /**
     * Test of sua method, of class PhieuNhapDAO.
     */
    @Test
    public void testSua() throws Exception {
        PhieuNhapDTO nv = new PhieuNhapDTO("", "", "id1", "", 900);
        PhieuNhapDAO instance = new PhieuNhapDAO();
        Boolean expResult =true;
        Boolean result = instance.sua(nv);
        assertEquals(expResult, result);
       
    }
    
}
