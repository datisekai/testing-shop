/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.LoaiDTO;
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
public class LoaiBUSTest {
     LoaiBUS instance;
    public LoaiBUSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
          instance = new LoaiBUS();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getList_Loai method, of class LoaiBUS.
     */
    @Test
    public void testGetList_Loai() {
        System.out.println("getList_Loai");
        int expSize = 5;
        ArrayList<LoaiDTO> result = instance.getList_Loai();
        assertEquals(expSize, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_Loai method, of class LoaiBUS.
     */
    @Test
    public void testSetList_Loai() {
        System.out.println("setList_Loai");
        instance.setList_Loai(new ArrayList<>());
        ArrayList<LoaiDTO> result = instance.getList_Loai();
        assertEquals(0, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumbLoai method, of class LoaiBUS.
     */
    @Test
    public void testGetNumbLoai() {
        System.out.println("getNumbLoai");
        int expResult = 5;
        int result = instance.getNumbLoai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
