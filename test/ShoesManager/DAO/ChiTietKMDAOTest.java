/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.ChiTietKMDTO;
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
public class ChiTietKMDAOTest {
    
    public ChiTietKMDAOTest() {
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
     * Test of docDB method, of class ChiTietKMDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB1");
        String condition = "1";
        String orderBy = "1";
        ChiTietKMDAO instance = new ChiTietKMDAO();
        ArrayList<ChiTietKMDTO> expResult = instance.docDB("1", "1");
        ArrayList<ChiTietKMDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class ChiTietKMDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB2");
        String condition = "1";
        ChiTietKMDAO instance = new ChiTietKMDAO();
        ArrayList<ChiTietKMDTO> expResult = instance.docDB("1");
        ArrayList<ChiTietKMDTO> result = instance.docDB(condition);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class ChiTietKMDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB3");
        ChiTietKMDAO instance = new ChiTietKMDAO();
        ArrayList<ChiTietKMDTO> expResult = instance.docDB();
        ArrayList<ChiTietKMDTO> result = instance.docDB();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class ChiTietKMDAO.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        ChiTietKMDTO hd = new ChiTietKMDTO("KM3", "SP1", 0.9);
        ChiTietKMDAO instance = new ChiTietKMDAO();
        Boolean expResult = true;
        Boolean result = instance.them(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class ChiTietKMDAO.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        ChiTietKMDTO hd = new ChiTietKMDTO("KM3", "SP1", 0.9);
        ChiTietKMDAO instance = new ChiTietKMDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class ChiTietKMDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        ChiTietKMDTO hd = new ChiTietKMDTO("KM3", "SP1", 0.2);
        ChiTietKMDAO instance = new ChiTietKMDAO();
        Boolean expResult = true;
        Boolean result = instance.sua(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
