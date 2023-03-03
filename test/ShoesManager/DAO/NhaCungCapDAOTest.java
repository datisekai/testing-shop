/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.NhaCungCapDTO;
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
public class NhaCungCapDAOTest {
    NhaCungCapDAO nhaCungCapDAO;
    
    public NhaCungCapDAOTest() {
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
     * Test of docDB method, of class NhaCungCapDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        String orderBy = "";
        NhaCungCapDAO instance = new NhaCungCapDAO();
        ArrayList<NhaCungCapDTO> expResult = null;
        ArrayList<NhaCungCapDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class NhaCungCapDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB");
        String condition = "";
        NhaCungCapDAO instance = new NhaCungCapDAO();
        ArrayList<NhaCungCapDTO> expResult = null;
        ArrayList<NhaCungCapDTO> result = instance.docDB(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docDB method, of class NhaCungCapDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB");
        boolean a;
        NhaCungCapDAO instance = new NhaCungCapDAO();
        ArrayList<NhaCungCapDTO> expResult =null;
        ArrayList<NhaCungCapDTO> result = instance.docDB();
        assertEquals(expResult, result);
    }

    /**
     * Test of them method, of class NhaCungCapDAO.
     */
    @Test
    public void testThemwithnull() throws Exception {
        NhaCungCapDTO nv = new NhaCungCapDTO("", "", "", "");
        NhaCungCapDAO instance = new NhaCungCapDAO();
        Boolean expResult =false ;
        Boolean result = instance.them(nv);
        assertEquals(expResult, result);
    }
    @Test
    public void testThemwithvalue() throws Exception {
        NhaCungCapDTO nv = new NhaCungCapDTO("asda", "asdas", "asd", "asda");
        NhaCungCapDAO instance = new NhaCungCapDAO();
        Boolean expResult =true ;
        Boolean result = instance.them(nv);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of xoa method, of class NhaCungCapDAO.
     */
    @Test
    public void testXoa() throws Exception {
        NhaCungCapDTO nv = new NhaCungCapDTO("asda", "asdas", "asd", "asda");
        NhaCungCapDAO instance = new NhaCungCapDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(nv);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of sua method, of class NhaCungCapDAO.
     */
    @Test
    public void testSua() throws Exception {
        NhaCungCapDTO nv = new NhaCungCapDTO("", "", "", "");
        NhaCungCapDAO instance = new NhaCungCapDAO();
        Boolean expResult = true;
        Boolean result = instance.sua(nv);
        assertEquals(expResult, result);
    }
    
}
