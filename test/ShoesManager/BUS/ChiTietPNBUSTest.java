/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DAO.ChiTietPNDAO;
import ShoesManager.DTO.ChiTietPNDTO;
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
public class ChiTietPNBUSTest {
    ChiTietPNBUS instance;
    ChiTietPNDTO ctpn;
    public ChiTietPNBUSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        instance = new ChiTietPNBUS();
        ctpn = new ChiTietPNDTO("PN001", "SP1", 10, 50);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of docDB method, of class ChiTietPNBUS.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");
        
        instance.docDB();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class ChiTietPNBUS.
     */

    /**
     * Test of deleteAll method, of class ChiTietPNBUS.
     */
    @Test
    public void testDeleteAll() {
        System.out.println("deleteAll");
        int expResult = 0;
        instance.deleteAll();
        int actualResult = instance.getNumbChiTietPN();
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getList_PN method, of class ChiTietPNBUS.
     */
  


    @Test
    public void testGetNumbChiTietPN() {
        System.out.println("getNumbChiTietPN");
        int expResult = 11;
        int result = instance.getNumbChiTietPN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class ChiTietPNBUS.
     */
    @Test
    public void testGetInfor() {
        System.out.println("getInfor");
        int i = 0;
        String expMaGiay = "SP1";
        ChiTietPNDTO result = instance.getInfor(i);
        assertEquals(expMaGiay, result.getStrMaGiay());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaSP method, of class ChiTietPNBUS.
     */
    @Test
    public void testTimKiem_MaSP() {
        System.out.println("timKiem_MaSP");
        String strMaSP1 = "SP1";
        String strMaSP2 = "SP2";
        int expResult = 4;
        ArrayList<ChiTietPNDTO> result = instance.timKiem_MaSP(strMaSP1, strMaSP2);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_SoLuong method, of class ChiTietPNBUS.
     */
    @Test
    public void testTimKiem_SoLuong() {
        System.out.println("timKiem_SoLuong");
        int SL1 = 0;
        int SL2 = 4;
        int expResult = 4;
        ArrayList<ChiTietPNDTO> result = instance.timKiem_SoLuong(SL1, SL2);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of kiemTraKhoachinh method, of class ChiTietPNBUS.
     */
    @Test
    public void testKiemTraKhoachinh() {
        System.out.println("kiemTraKhoachinh");
        ChiTietPNDTO pn = ctpn;
        boolean expResult = true;
        boolean result = instance.kiemTraKhoachinh(pn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class ChiTietPNBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        int preSize = instance.getNumbChiTietPN();
        Boolean result = instance.them(ctpn);
        int curSize = instance.getNumbChiTietPN();
        if(result){
            assertEquals(preSize + 1, curSize);
        }else{
            assertEquals(preSize, curSize);
        }
        // TODO review the generated test code and remxove the default call to fail.
    }

    /**
     * Test of xoa method, of class ChiTietPNBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        int preSize = instance.getNumbChiTietPN();
        Boolean result = instance.xoa(ctpn);
        int curSize = instance.getNumbChiTietPN();
        if(result){
            assertEquals(preSize - 1, curSize);
        }else{
            assertEquals(preSize, curSize);
        }
    }

    /**
     * Test of sua method, of class ChiTietPNBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        int expQty = 12;
        ChiTietPNDTO pn = ctpn;
        pn.setiSoLuong(expQty);
        Boolean result = instance.sua(pn);
        int curPN = instance.getInfor(0).getiSoLuong();
        if(result){
            assertEquals(expQty, curPN);
        }else{
            assertEquals(ctpn.getiSoLuong(), curPN);
        }
    }
    
}
