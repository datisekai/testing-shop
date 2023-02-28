/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.TaiKhoanDTO;
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
public class TaiKhoanBUSTest {
    
    public TaiKhoanBUSTest() {
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
     * Test of them method, of class TaiKhoanBUS.
     */
    @Test
    public void testThem() throws Exception  {
        System.out.println("them");
        TaiKhoanDTO tk = new TaiKhoanDTO("admin1", "abc", 1);
        TaiKhoanBUS instance = new TaiKhoanBUS();
        Boolean expResult = true;
        Boolean result = instance.them(tk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Fail");
    }

    
}
