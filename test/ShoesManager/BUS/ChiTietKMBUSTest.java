/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

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
 * @author datly
 */
public class ChiTietKMBUSTest {

    ChiTietKMBUS instance;
    ChiTietKMDTO ctkm;

    public ChiTietKMBUSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        instance = new ChiTietKMBUS();
        ctkm = new ChiTietKMDTO("KM1", "SP1", 0.1);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of docDB method, of class ChiTietKMBUS.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");

        instance.docDB();
        int expSize = 15;
        int actualSize = instance.getNumbKM();
        assertEquals(expSize, actualSize);

    }

    /**
     * Test of getNumbKM method, of class ChiTietKMBUS.
     */
    @Test
    public void testGetNumbKM() {
        System.out.println("getNumbKM");
        int expResult = 15;
        int result = instance.getNumbKM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getList_KM method, of class ChiTietKMBUS.
     */
    @Test
    public void testGetList_KM() {
        System.out.println("getList_KM");
        int expSize = 15;
        int actualSize = instance.getList_KM().size();
        assertEquals(expSize, actualSize);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_KM method, of class ChiTietKMBUS.
     */
   
    /**
     * Test of kiemTraKhoachinh method, of class ChiTietKMBUS.
     */
    @Test
    public void testKiemTraKhoachinh() {
        System.out.println("kiemTraKhoachinh");
        boolean expResult = true;
        boolean result = instance.kiemTraKhoachinh(ctkm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class ChiTietKMBUS.
     */
    @Test
    public void testGetInfor_String_String() {
        System.out.println("getInfor");
        String strMaGiay = "SP1";
        String strMaKM = "KM1";
        ChiTietKMDTO result = instance.getInfor(strMaGiay, strMaKM);
        assertEquals("0.1", result.getTiLeKM() + "");
    }

    /**
     * Test of getInfor method, of class ChiTietKMBUS.
     */
    @Test
    public void testGetInfor_String() {
        System.out.println("getInfor");
        String strMaGiay = "SP1";
        ChiTietKMDTO result = instance.getInfor(strMaGiay);
        assertEquals("KM5", result.getStrMaKM());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class ChiTietKMBUS.
     */
    @Test
    public void testGetInfor_int() {
        System.out.println("getInfor");
        int i = 0;
        ChiTietKMDTO expResult = ctkm;
        ChiTietKMDTO result = instance.getInfor(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class ChiTietKMBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        Boolean expResult = false;
        Boolean result = instance.them(ctkm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class ChiTietKMBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        Boolean expResult = false;
        Boolean result = instance.xoa(ctkm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class ChiTietKMBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        ChiTietKMDTO kh = null;
        ChiTietKMBUS instance = new ChiTietKMBUS();
        Boolean expResult = null;
        Boolean result = instance.sua(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaSP method, of class ChiTietKMBUS.
     */
    @Test
    public void testTimKiem_MaSP() {
        System.out.println("timKiem_MaSP");
        String strMaSP1 = "SP1";
        String strMaSP2 = "SP2";
        ArrayList<ChiTietKMDTO> result = instance.timKiem_MaSP(strMaSP1, strMaSP2);
        assertEquals(6, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_TiLeKM method, of class ChiTietKMBUS.
     */
    @Test
    public void testTimKiem_TiLeKM() {
        System.out.println("timKiem_TiLeKM");
        double SL1 = 0.0;
        double SL2 = 0.2;
        ArrayList<ChiTietKMDTO> result = instance.timKiem_TiLeKM(SL1, SL2);
        assertEquals(3, result.size());
    }

}
