/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.ChiTietPNDTO;
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
public class ChiTietPNDAOTest {
    
    public ChiTietPNDAOTest() {
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
     * Test of docDB method, of class ChiTietPNDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB1");
        String condition = "1";
        String orderBy = "1";
        ChiTietPNDAO instance = new ChiTietPNDAO();
        ArrayList<ChiTietPNDTO> expResult = instance.docDB("1", "1");
        ArrayList<ChiTietPNDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class ChiTietPNDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB2");
        String condition = "1";
        ChiTietPNDAO instance = new ChiTietPNDAO();
        ArrayList<ChiTietPNDTO> expResult = instance.docDB("1");
        ArrayList<ChiTietPNDTO> result = instance.docDB(condition);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class ChiTietPNDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB3");
        ChiTietPNDAO instance = new ChiTietPNDAO();
        ArrayList<ChiTietPNDTO> expResult = instance.docDB();
        ArrayList<ChiTietPNDTO> result = instance.docDB();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class ChiTietPNDAO.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        ChiTietPNDTO pn = new ChiTietPNDTO("PN002", "SP3", 9, 300);
        ChiTietPNDAO instance = new ChiTietPNDAO();
        Boolean expResult = true;
        Boolean result = instance.them(pn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class ChiTietPNDAO.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        ChiTietPNDTO pn = new ChiTietPNDTO("PN002", "SP3", 9, 300);
        ChiTietPNDAO instance = new ChiTietPNDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(pn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class ChiTietPNDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        ChiTietPNDTO pn = new ChiTietPNDTO("PN002", "SP3", 90, 300);
        ChiTietPNDAO instance = new ChiTietPNDAO();
        Boolean expResult = true;
        Boolean result = instance.sua(pn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
