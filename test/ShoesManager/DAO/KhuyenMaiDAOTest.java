/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import ShoesManager.DTO.KhuyenMaiDTO;
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
public class KhuyenMaiDAOTest {
    
    public KhuyenMaiDAOTest() {
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
     * Test of docDB method, of class KhuyenMaiDAO.
     */
    @Test
    public void testDocDB_String_String() throws Exception {
        System.out.println("docDB1");
        String condition = "1";
        String orderBy = "1";
        KhuyenMaiDAO instance = new KhuyenMaiDAO();
        ArrayList<KhuyenMaiDTO> expResult = instance.docDB("1", "1");
        ArrayList<KhuyenMaiDTO> result = instance.docDB(condition, orderBy);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class KhuyenMaiDAO.
     */
    @Test
    public void testDocDB_String() throws Exception {
        System.out.println("docDB2");
        String condition = "1";
        KhuyenMaiDAO instance = new KhuyenMaiDAO();
        ArrayList<KhuyenMaiDTO> expResult = instance.docDB("1");
        ArrayList<KhuyenMaiDTO> result = instance.docDB(condition);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of docDB method, of class KhuyenMaiDAO.
     */
    @Test
    public void testDocDB_0args() throws Exception {
        System.out.println("docDB3");
        KhuyenMaiDAO instance = new KhuyenMaiDAO();
        ArrayList<KhuyenMaiDTO> expResult = instance.docDB();
        ArrayList<KhuyenMaiDTO> result = instance.docDB();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class KhuyenMaiDAO.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        KhuyenMaiDTO km = new KhuyenMaiDTO("KM7", "Khuyến mãi mùa sale", "Loại 1", "bình thường", "13 May 2020", "15 May 2020");
        KhuyenMaiDAO instance = new KhuyenMaiDAO();
        Boolean expResult = true;
        Boolean result = instance.them(km);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class KhuyenMaiDAO.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        KhuyenMaiDTO km = new KhuyenMaiDTO("KM7", "Khuyến mãi mùa sale", "Loại 1", "bình thường", "13 May 2020", "15 May 2020");
        KhuyenMaiDAO instance = new KhuyenMaiDAO();
        Boolean expResult = true;
        Boolean result = instance.xoa(km);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class KhuyenMaiDAO.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        KhuyenMaiDTO km = new KhuyenMaiDTO("KM7", "Khuyến mãi mùa sale", "Loại 2", "bình thường", "13 May 2020", "15 May 2020");
        KhuyenMaiDAO instance = new KhuyenMaiDAO();
        Boolean expResult = true;
        Boolean result = instance.sua(km);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
