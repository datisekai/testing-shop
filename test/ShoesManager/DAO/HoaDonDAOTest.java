/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.HoaDonDTO;
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
public class HoaDonDAOTest {
    
    public HoaDonDAOTest() {
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
     * Test of docDB method, of class HoaDonDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB1");
        String condition = "1";
        String orderBy = "1";
        HoaDonDAO instance = new HoaDonDAO();
        ArrayList<HoaDonDTO> expResult = instance.docDB("1", "1");
        ArrayList<HoaDonDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class HoaDonDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB2");
        String condition = "1";
        HoaDonDAO instance = new HoaDonDAO();
        ArrayList<HoaDonDTO> expResult = instance.docDB("1");
        ArrayList<HoaDonDTO> result = instance.docDB(condition);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class HoaDonDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB3");
        HoaDonDAO instance = new HoaDonDAO();
        ArrayList<HoaDonDTO> expResult = instance.docDB();;
        ArrayList<HoaDonDTO> result = instance.docDB();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class HoaDonDAO.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        HoaDonDTO hd = new HoaDonDTO("HD013", "admin", "KH1", "KM3", "08 Jun 2020", 220);
        HoaDonDAO instance = new HoaDonDAO();
        Boolean expResult = true;
        Boolean result = instance.them(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class HoaDonDAO.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        HoaDonDTO hd = new HoaDonDTO("HD013", "admin", "KH1", "KM3", "08 Jun 2020", 220);
        HoaDonDAO instance = new HoaDonDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class HoaDonDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        HoaDonDTO hd = new HoaDonDTO("HD013", "admin", "KH1", "KM3", "08 Jun 2020", 240);
        HoaDonDAO instance = new HoaDonDAO();
        Boolean expResult = true;
        Boolean result = instance.sua(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
