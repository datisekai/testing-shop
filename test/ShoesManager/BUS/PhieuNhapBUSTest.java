/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.PhieuNhapDTO;
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
public class PhieuNhapBUSTest {

    PhieuNhapBUS instance;
    PhieuNhapDTO pn;

    public PhieuNhapBUSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        instance = new PhieuNhapBUS();
        pn = new PhieuNhapDTO("PN004", "NCC3", "admin", "abc", 0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class PhieuNhapBUS.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int preSize = instance.getNumb();
        instance.add(pn);
        int curSize = instance.getNumb();
        assertEquals(preSize + 1, curSize);
    }

    /**
     * Test of deleteAll method, of class PhieuNhapBUS.
     */
    @Test
    public void testDeleteAll() {
        System.out.println("deleteAll");
        int expSize = 0;
        instance.deleteAll();
        int actualSize = instance.getNumb();
        assertEquals(expSize, actualSize);
    }

    /**
     * Test of docDB method, of class PhieuNhapBUS.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");
        instance.docDB();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getList_TK method, of class PhieuNhapBUS.
     */
    /**
     * Test of getNumb method, of class PhieuNhapBUS.
     */
    @Test
    public void testGetNumb() {
        System.out.println("getNumb");
        int expResult = 3;
        int result = instance.getNumb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class PhieuNhapBUS.
     */
    @Test
    public void testGetInfor() {
        System.out.println("getInfor");
        int i = 0;
        String expNCC = "NCC1";
        PhieuNhapDTO result = instance.getInfor(i);
        assertEquals(expNCC, result.getStrMaNCC());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of demSoChuSo method, of class PhieuNhapBUS.
     */
    /**
     * Test of getDefaultMaPN method, of class PhieuNhapBUS.
     */
    @Test
    public void testGetDefaultMaPN() {
        System.out.println("getDefaultMaPN");
        String expResult = "PN004";
        String result = instance.getDefaultMaPN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaPN method, of class PhieuNhapBUS.
     */
    @Test
    public void testTimKiem_MaPN() {
        System.out.println("timKiem_MaPN");
        String strMaPN = "PN001";
        int expSize = 1;
        ArrayList<PhieuNhapDTO> result = instance.timKiem_MaPN(strMaPN);
        assertEquals(expSize, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaNV method, of class PhieuNhapBUS.
     */
    @Test
    public void testTimKiem_MaNV() {
        System.out.println("timKiem_MaNV");
        String strMaNV = "admin";
        int expResult = 3;
        ArrayList<PhieuNhapDTO> result = instance.timKiem_MaNV(strMaNV);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaNCC method, of class PhieuNhapBUS.
     */
    @Test
    public void testTimKiem_MaNCC() {
        System.out.println("timKiem_MaNCC");
        String strMaNCC = "NCC1";
        int expResult = 1;
        ArrayList<PhieuNhapDTO> result = instance.timKiem_MaNCC(strMaNCC);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of timKiem_TongTien method, of class PhieuNhapBUS.
     */
    @Test
    public void testTimKiem_TongTien() {
        System.out.println("timKiem_TongTien");
        String strTT = "2500";
        int expResult = 2;
        ArrayList<PhieuNhapDTO> result = instance.timKiem_TongTien(strTT);
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class PhieuNhapBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        int preSize = instance.getNumb();
        Boolean result = instance.them(pn);
        int curSize = instance.getNumb();
        if (result) {
            assertEquals(preSize + 1, curSize);
        } else {
            assertEquals(preSize, curSize);
        }

    }

    /**
     * Test of xoa method, of class PhieuNhapBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        int preSize = instance.getNumb();
        Boolean result = instance.xoa(pn);
        int curSize = instance.getNumb();
        if (result) {
            assertEquals(preSize - 1, curSize);
        } else {
            assertEquals(preSize, curSize);
        }
    }

    /**
     * Test of sua method, of class PhieuNhapBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        int expTongTien = 500;
        PhieuNhapDTO tk = new PhieuNhapDTO("PN001", "NCC1", "admin", "08 Jun 2020", expTongTien);
        Boolean result = instance.sua(tk);
        double actualTongTien = instance.getInfor(0).getTongTien();
        if (result) {
            assertEquals(expTongTien + "",  actualTongTien + "");
        }

    }

}
