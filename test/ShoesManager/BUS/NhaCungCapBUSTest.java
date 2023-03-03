/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

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
 * @author datly
 */
public class NhaCungCapBUSTest {

    NhaCungCapBUS instance;
    NhaCungCapDTO ncc;

    public NhaCungCapBUSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        instance = new NhaCungCapBUS();
        ncc = new NhaCungCapDTO("NCC6", "Datisekai", "abc", "abc@gmail.com");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getList_NV method, of class NhaCungCapBUS.
     */
    @Test
    public void testGetList_NV() {
        System.out.println("getList_NV");
        int expResult = 6;
        ArrayList<NhaCungCapDTO> result = instance.getList_NV();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_NV method, of class NhaCungCapBUS.
     */
    @Test
    public void testSetList_NV() {
        System.out.println("setList_NV");
        instance.setList_NV(new ArrayList<>());
        int expResult = 0;
        ArrayList<NhaCungCapDTO> result = instance.getList_NV();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumb method, of class NhaCungCapBUS.
     */
    @Test
    public void testGetNumb() {
        System.out.println("getNumb");
        int expResult = 6;
        int result = instance.getNumb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class NhaCungCapBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        int preSize = instance.getNumb();
        Boolean flag = instance.them(ncc);
        int curSize = instance.getNumb();

        if (flag) {
            assertEquals(preSize + 1, curSize);
        }
        assertEquals(preSize, curSize);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class NhaCungCapBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        int preSize = instance.getNumb();
        Boolean result = instance.xoa(ncc);
        int curSize = instance.getNumb();

        if (result) {
            assertEquals(preSize + 1, curSize);
        } else {
            assertEquals(preSize, curSize);
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class NhaCungCapBUS.
     */


}
