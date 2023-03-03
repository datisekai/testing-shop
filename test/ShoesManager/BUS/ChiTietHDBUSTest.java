/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DAO.ChiTietHDDAO;
import ShoesManager.DTO.ChiTietHDDTO;
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
public class ChiTietHDBUSTest {

    ChiTietHDBUS instance;
    ChiTietHDDTO chitiethd;

    public ChiTietHDBUSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        instance = new ChiTietHDBUS();
        chitiethd = new ChiTietHDDTO("SP1", "HD001", 10, 100);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of docDB method, of class ChiTietHDBUS.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");
        instance = new ChiTietHDBUS();
        instance.docDB();
        int expResult = 25;
        int actualResult = instance.getNumbChiTietHD();
        assertEquals(expResult, actualResult);
    }

    /**
     * Test of add method, of class ChiTietHDBUS.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        int preSize = instance.getNumbChiTietHD();
        instance.add(chitiethd);
        int curSize = instance.getNumbChiTietHD();
        assertEquals(preSize + 1, curSize);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteAll method, of class ChiTietHDBUS.
     */
    @Test
    public void testDeleteAll() throws Exception {
        System.out.println("deleteAll");
        instance.deleteAll();
        int curSize = instance.getNumbChiTietHD();
        assertEquals(0, curSize);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getList_HD method, of class ChiTietHDBUS.
     */
    @Test
    public void testGetList_HD() throws Exception {
        System.out.println("getList_HD");
        int expectedSize = instance.getList_HD().size();
        int actualSize = instance.getNumbChiTietHD();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of setList_HD method, of class ChiTietHDBUS.
     */
    @Test
    public void testSetList_HD() throws Exception {
        System.out.println("setList_HD");
        ArrayList<ChiTietHDDTO> list_HD = null;
        ChiTietHDBUS instance = new ChiTietHDBUS();
        instance.setList_HD(list_HD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHdDAO method, of class ChiTietHDBUS.
     */
    @Test
    public void testGetHdDAO() throws Exception {
        System.out.println("getHdDAO");
        ChiTietHDBUS instance = new ChiTietHDBUS();
        ChiTietHDDAO expResult = null;
        ChiTietHDDAO result = instance.getHdDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHdDAO method, of class ChiTietHDBUS.
     */
    @Test
    public void testSetHdDAO() throws Exception {
        System.out.println("setHdDAO");
        ChiTietHDDAO hdDAO = null;
        ChiTietHDBUS instance = new ChiTietHDBUS();
        instance.setHdDAO(hdDAO);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumbChiTietHD method, of class ChiTietHDBUS.
     */
    @Test
    public void testGetNumbChiTietHD() throws Exception {
        System.out.println("getNumbChiTietHD");
        ChiTietHDBUS instance = new ChiTietHDBUS();
        int expResult = 25;
        int result = instance.getNumbChiTietHD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInfor method, of class ChiTietHDBUS.
     */
    @Test
    public void testGetInfor() throws Exception {
        System.out.println("getInfor");
        ChiTietHDDTO expected = instance.getInfor(0);
        ChiTietHDDTO actual = instance.getList_HD().get(0);
        assertEquals(expected, actual);
    }

    /**
     * Test of timKiem_MaSP method, of class ChiTietHDBUS.
     */
    @Test
    public void testTimKiem_MaSP() throws Exception {
        System.out.println("timKiem_MaSP");
        ArrayList<ChiTietHDDTO> expected = new ArrayList<>();
        expected.add(chitiethd);

        ArrayList<ChiTietHDDTO> actual = instance.timKiem_MaSP("MSP001", "MSP001", 0);

        assertEquals(expected, actual);
    }

    /**
     * Test of timKiem_SoLuong method, of class ChiTietHDBUS.
     */
    @Test
    public void testTimKiem_SoLuong() throws Exception {
        System.out.println("timKiem_SoLuong");
        ArrayList<ChiTietHDDTO> expected = new ArrayList<>();
        expected.add(chitiethd);

        ArrayList<ChiTietHDDTO> actual = instance.timKiem_SoLuong(10, 10, 0);

        assertEquals(expected, actual);
    }

    /**
     * Test of kiemTraKhoachinh method, of class ChiTietHDBUS.
     */
    @Test
    public void testKiemTraKhoachinh() throws Exception {
        System.out.println("kiemTraKhoachinh");
        boolean expected = instance.kiemTraKhoachinh(chitiethd);
        boolean actual = false;
        assertEquals(expected, actual);
    }

    /**
     * Test of them method, of class ChiTietHDBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        int preSize = instance.getNumbChiTietHD();
        instance.add(chitiethd);
        int curSize = instance.getNumbChiTietHD();
        assertEquals(preSize + 1, curSize);
    }

    /**
     * Test of xoa method, of class ChiTietHDBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        int preSize = instance.getNumbChiTietHD();
        instance.add(chitiethd);
        int curSize = instance.getNumbChiTietHD();
        assertEquals(preSize - 1, curSize);
    }

    /**
     * Test of sua method, of class ChiTietHDBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        ChiTietHDDTO hd = null;
        ChiTietHDBUS instance = new ChiTietHDBUS();
        Boolean expResult = null;
        Boolean result = instance.sua(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
