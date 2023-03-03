/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

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
 * @author datly
 */
public class ThuongHieuBUSTest {
    
    public ThuongHieuBUSTest() {
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
     * Test of getList_ThuongHieu method, of class ThuongHieuBUS.
     */
    @Test
    public void testGetList_ThuongHieu() throws Exception {
        System.out.println("getList_ThuongHieu");
        ThuongHieuBUS instance = new ThuongHieuBUS();
        int expResult = 5;
        ArrayList<ThuongHieuDTO> result = instance.getList_ThuongHieu();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_ThuongHieu method, of class ThuongHieuBUS.
     */
    @Test
    public void testSetList_ThuongHieu() throws Exception {
        System.out.println("setList_ThuongHieu");
        ArrayList<ThuongHieuDTO> list_ThuongHieu = new ArrayList<>();
        ThuongHieuBUS instance = new ThuongHieuBUS();
        instance.setList_ThuongHieu(list_ThuongHieu);
        int expResult = 0;
        ArrayList<ThuongHieuDTO> actualResult = instance.getList_ThuongHieu();
        assertEquals(expResult, actualResult.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumbThuongHieu method, of class ThuongHieuBUS.
     */
    @Test
    public void testGetNumbThuongHieu() throws Exception {
        System.out.println("getNumbThuongHieu");
        ThuongHieuBUS instance = new ThuongHieuBUS();
        int expResult = 5;
        int result = instance.getNumbThuongHieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
