/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DAO.HoaDonDAO;
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
 * @author datly
 */
public class HoaDonBUSTest {

    HoaDonBUS instance;
    HoaDonDTO hd;

    public HoaDonBUSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        instance = new HoaDonBUS();
        hd = new HoaDonDTO("HD013", "admin", "KH1", "KM2", "08 Jun 2020", 0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of docDB method, of class HoaDonBUS.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");

        instance.docDB();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HoaDonBUS.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int preSize = instance.getNumbHoaDon();
        instance.add(hd);
        int curSize = instance.getNumbHoaDon();

        assertEquals(preSize + 1, curSize);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteAll method, of class HoaDonBUS.
     */
    @Test
    public void testDeleteAll() {
        System.out.println("deleteAll");
        instance.deleteAll();
        int curSize = instance.getNumbHoaDon();

        assertEquals(0, curSize);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHdDAO method, of class HoaDonBUS.
     */
    /**
     * Test of getNumbHoaDon method, of class HoaDonBUS.
     */
    @Test
    public void testGetNumbHoaDon() {
        System.out.println("getNumbHoaDon");
        int expResult = 11;
        int result = instance.getNumbHoaDon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInfor method, of class HoaDonBUS.
     */
    @Test
    public void testGetInfor_int() {
        System.out.println("getInfor");
        int i = 0;
        HoaDonDTO result = instance.getInfor(i);
        assertEquals("HD001", result.getStrMaHD());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class HoaDonBUS.
     */
    @Test
    public void testGetInfor_String() {
        System.out.println("getInfor");
        String strMaHD = "HD001";
        HoaDonDTO result = instance.getInfor(strMaHD);
        assertEquals("300", result.getTongTien() + "");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMaKM method, of class HoaDonBUS.
     */
    @Test
    public void testGetMaKM() {
        System.out.println("getMaKM");
        String MaHD = "HD001";
        String expResult = "KM2";
        String result = instance.getMaKM(MaHD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaHD method, of class HoaDonBUS.
     */
    @Test
    public void testTimKiem_MaHD() {
        System.out.println("timKiem_MaHD");
        String strMaHD = "HD001";
        boolean sapxep = false;
        int expResult = 1;
        ArrayList<HoaDonDTO> result = instance.timKiem_MaHD(strMaHD, sapxep);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaNV method, of class HoaDonBUS.
     */
    @Test
    public void testTimKiem_MaNV() {
        System.out.println("timKiem_MaNV");
        String strMaNV = "admin";
        boolean sapxep = false;
        int expResult = 11;
        ArrayList<HoaDonDTO> result = instance.timKiem_MaNV(strMaNV, sapxep);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaKH method, of class HoaDonBUS.
     */
    @Test
    public void testTimKiem_MaKH() {
        System.out.println("timKiem_MaKH");
        String strMaKH = "KH1";
        boolean sapxep = false;
        int expResult = 3;
        ArrayList<HoaDonDTO> result = instance.timKiem_MaKH(strMaKH, sapxep);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaKM method, of class HoaDonBUS.
     */
    @Test
    public void testTimKiem_MaKM() {
        System.out.println("timKiem_MaKM");
        String strMaKM = "KM2";
        boolean sapxep = false;
        int expResult = 2;
        ArrayList<HoaDonDTO> result = instance.timKiem_MaKM(strMaKM, sapxep);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_TongTien method, of class HoaDonBUS.
     */
    @Test
    public void testTimKiem_TongTien() {
        System.out.println("timKiem_TongTien");
        String strTT = "300";
        boolean sapxep = false;
        int expResult = 1;
        ArrayList<HoaDonDTO> result = instance.timKiem_TongTien(strTT, sapxep);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDefaultMaHD method, of class HoaDonBUS.
     */
  
    

    /**
     * Test of them method, of class HoaDonBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        int preSize = instance.getNumbHoaDon();
        Boolean result = instance.them(hd);
        int curSize= instance.getNumbHoaDon();
        if(result){
            assertEquals(preSize + 1, curSize);
        }else{
             assertEquals(preSize, curSize);
        }
    }

    /**
     * Test of xoa method, of class HoaDonBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        HoaDonDTO hd = null;
        HoaDonBUS instance = new HoaDonBUS();
        Boolean expResult = null;
        Boolean result = instance.xoa(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class HoaDonBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        double expPrice = 500;
        HoaDonDTO hdUpdate = hd;
        hd.setTongTien(expPrice);
        Boolean result = instance.sua(hd);
        double actualPrice = instance.getInfor(hdUpdate.getStrMaHD()).getTongTien();
        assertEquals(expPrice, actualPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getList_HD method, of class HoaDonBUS.
     */
   
    

}
