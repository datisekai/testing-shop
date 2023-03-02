/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.KhuyenMaiDTO;
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
public class KhuyenMaiBUSTest {
    
    public KhuyenMaiBUSTest() {
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
     * Test of docDB method, of class KhuyenMaiBUS.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        instance.docDB();
        int expResult = 6;
        int actualResult = instance.getList_KM().size();
        assertEquals(expResult, actualResult);
    }

    /**
     * Test of getNumb method, of class KhuyenMaiBUS.
     */
    @Test
    public void testGetNumb() throws Exception {
        System.out.println("getNumb");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        int expResult = 6;
        int result = instance.getNumb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class KhuyenMaiBUS.
     */
    @Test
    public void testGetInfor_int() throws Exception {
        System.out.println("getInfor");
        int i = 0;
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        String expResult = "vip";
        String result = instance.getInfor(i).getStrDieuKien() ;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class KhuyenMaiBUS.
     */
    @Test
    public void testGetInfor_String() throws Exception {
        System.out.println("getInfor");
        String strMaKM = "KM1";
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        String expResult = "Mùa hè xanh";
        String result = instance.getInfor(strMaKM).getStrTenChuongTrinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumbKM method, of class KhuyenMaiBUS.
     */
    @Test
    public void testGetNumbKM() throws Exception {
        System.out.println("getNumbKM");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        int expResult = 6;
        int result = instance.getNumbKM();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDefaultMaKM method, of class KhuyenMaiBUS.
     */
    @Test
    public void testGetDefaultMaKM() throws Exception {
        System.out.println("getDefaultMaKM");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        String expResult = "KM7";
        String result = instance.getDefaultMaKM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of demSoChuSo method, of class KhuyenMaiBUS.
     * @throws java.lang.Exception
     */
    @Test
    public void testDemSoChuSo() throws Exception {
        System.out.println("demSoChuSo");
        int nInput = 0;
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        int expResult = 1;
        int result = instance.demSoChuSo(nInput);
        assertEquals(expResult, result);
    }

    /**
     * Test of getList_KM method, of class KhuyenMaiBUS.
     */
    @Test
    public void testGetList_KM() throws Exception {
        System.out.println("getList_KM");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        int expResult = 6;
        ArrayList<KhuyenMaiDTO> result = instance.getList_KM();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_KM method, of class KhuyenMaiBUS.
     */
    @Test
    public void testSetList_KM() throws Exception {
        System.out.println("setList_KM");
        ArrayList<KhuyenMaiDTO> list_KM = new ArrayList<>();
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        instance.setList_KM(list_KM);
        int expResult = 0;
        int actualResult = instance.getList_KM().size();
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_MaKM method, of class KhuyenMaiBUS.
     */
    @Test
    public void testTimKiem_MaKM() throws Exception {
        System.out.println("timKiem_MaKM");
        String strMaKM = "KM6";
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        int expResult = 1;
        int result = instance.timKiem_MaKM(strMaKM).size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_TenCT method, of class KhuyenMaiBUS.
     */
    @Test
    public void testTimKiem_TenCT() throws Exception {
        System.out.println("timKiem_TenCT");
        String strTenCT = "Mùa hè xanh";
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        int expResult = 1;
        int result = instance.timKiem_TenCT(strTenCT).size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class KhuyenMaiBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        KhuyenMaiDTO kh = new KhuyenMaiDTO("KM7", "abc", "abc", "abc", "abc", "abc");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        Boolean expResult = true;
        Boolean result = instance.them(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of xoa method, of class KhuyenMaiBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        KhuyenMaiDTO kh = new KhuyenMaiDTO("abc", "abc", "abc", "abc", "abc", "abc");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        Boolean expResult = true;
        Boolean result = instance.xoa(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sua method, of class KhuyenMaiBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        KhuyenMaiDTO kh = new KhuyenMaiDTO("km6", "Khuyến mãi 6", "", "", "", "");
        KhuyenMaiBUS instance = new KhuyenMaiBUS();
        Boolean expResult = true;
        Boolean result = instance.sua(kh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
