/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.LoaiDTO;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author haidu
 */
public class LoaiDAOTest {
    
    public LoaiDAOTest() {
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
     * Test of docDB method, of class LoaiDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB1");
        String condition = "1";
        String orderBy = "1";
        LoaiDAO instance = new LoaiDAO();
        ArrayList<LoaiDTO> expResult = instance.docDB("1", "1");
        ArrayList<LoaiDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of docDB method, of class LoaiDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB2");
        String condition = "1";
        LoaiDAO instance = new LoaiDAO();
        ArrayList<LoaiDTO> expResult = instance.docDB("1");
        ArrayList<LoaiDTO> result = instance.docDB(condition);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of docDB method, of class LoaiDAO.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB3");
        LoaiDAO instance = new LoaiDAO();
        ArrayList<LoaiDTO> expResult = instance.docDB();
        ArrayList<LoaiDTO> result = instance.docDB();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
