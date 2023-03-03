/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.XuatXuDTO;
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
public class XuatXuBUSTest {
    
    public XuatXuBUSTest() {
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
     * Test of getList_XuatXu method, of class XuatXuBUS.
     */
    @Test
    public void testGetList_XuatXu() throws Exception {
        System.out.println("getList_XuatXu");
        XuatXuBUS instance = new XuatXuBUS();
        int expResult = 5;
        ArrayList<XuatXuDTO> result = instance.getList_XuatXu();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_XuatXu method, of class XuatXuBUS.
     */
    @Test
    public void testSetList_XuatXu() throws Exception {
        System.out.println("setList_XuatXu");
        ArrayList<XuatXuDTO> list_XuatXu = new ArrayList<>();
        XuatXuBUS instance = new XuatXuBUS();
        instance.setList_XuatXu(list_XuatXu);
        int expResult = 0;
        ArrayList<XuatXuDTO> actualResult = instance.getList_XuatXu();
        
         assertEquals(expResult, actualResult.size());
    }

    /**
     * Test of getNumbXuatXu method, of class XuatXuBUS.
     */
    @Test
    public void testGetNumbXuatXu() throws Exception {
        System.out.println("getNumbXuatXu");
        XuatXuBUS instance = new XuatXuBUS();
        int expResult = 5;
        int result = instance.getNumbXuatXu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
