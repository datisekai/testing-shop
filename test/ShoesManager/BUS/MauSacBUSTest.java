/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.MauSacDTO;
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
public class MauSacBUSTest {

    public MauSacBUSTest() {
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
     * Test of getList_MauSac method, of class MauSacBUS.
     */
    @Test
    public void testGetList_MauSac() throws Exception {
        System.out.println("getList_MauSac");
        MauSacBUS instance = new MauSacBUS();
        int expResult = 5;
        ArrayList<MauSacDTO> result = instance.getList_MauSac();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_MauSac method, of class MauSacBUS.
     */
    @Test
    public void testSetList_MauSac() throws Exception {
        System.out.println("setList_MauSac");
        ArrayList<MauSacDTO> list_MauSac = new ArrayList<>();
        MauSacBUS instance = new MauSacBUS();
        instance.setList_MauSac(list_MauSac);
        int expResult = 0;
        ArrayList<MauSacDTO> actualResult = instance.getList_MauSac();

        assertEquals(expResult, actualResult.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumbMauSac method, of class MauSacBUS.
     */
    @Test
    public void testGetNumbMauSac() throws Exception {
        System.out.println("getNumbMauSac");
        MauSacBUS instance = new MauSacBUS();
        int expResult = 5;
        int result = instance.getNumbMauSac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
