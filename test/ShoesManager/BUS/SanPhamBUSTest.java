/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.SanPhamDTO;
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
public class SanPhamBUSTest {

    SanPhamBUS instance;
    SanPhamDTO sp;

    public SanPhamBUSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        instance = new SanPhamBUS();
        sp = new SanPhamDTO("SP7", "abc", "Nam", "abc", "3", "VN", "WT", "AD", 0, 200, 30);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of docDB method, of class SanPhamBUS.
     */
    @Test
    public void testDocDB() throws Exception {
        System.out.println("docDB");
        instance.docDB();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getList_SP method, of class SanPhamBUS.
     */
    @Test
    public void testGetList_SP() {
        System.out.println("getList_SP");
        int expSize = 6;
        ArrayList<SanPhamDTO> result = instance.getList_SP();
        assertEquals(expSize, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_SP method, of class SanPhamBUS.
     */
    /**
     * Test of getNumbSanPham method, of class SanPhamBUS.
     */
    @Test
    public void testGetNumbSanPham() {
        System.out.println("getNumbSanPham");
        int expResult = 6;
        int result = instance.getNumbSanPham();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDefaultMaHD method, of class SanPhamBUS.
     */
    @Test
    public void testGetDefaultMaHD() {
        System.out.println("getDefaultMaHD");
        String expResult = "SP7";
        String result = instance.getDefaultMaHD();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSoLuongCuaSanPham method, of class SanPhamBUS.
     */
    @Test
    public void testGetSoLuongCuaSanPham() {
        System.out.println("getSoLuongCuaSanPham");
        String strMaGiay = "1";
        int expResult = 1;
        int result = instance.getSoLuongCuaSanPham(strMaGiay);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInfor method, of class SanPhamBUS.
     */
    @Test
    public void testGetInfor_String() {
        System.out.println("getInfor");
        String strMaSP = "SP1";
        int expResult = 29;
        SanPhamDTO result = instance.getInfor(strMaSP);
        assertEquals(expResult, result.getiSize());
    }

    /**
     * Test of getInfor method, of class SanPhamBUS.
     */
    @Test
    public void testGetInfor_int() {
        System.out.println("getInfor");
        int i = 0;
        int expSize = 29;
        SanPhamDTO result = instance.getInfor(i);
        assertEquals(expSize, result.getiSize());
    }

    /**
     * Test of timKiem_MaSP method, of class SanPhamBUS.
     */
    @Test
    public void testTimKiem_MaSP() {
        System.out.println("timKiem_MaSP");
        String strMaSP1 = "SP1";
        String strMaSP2 = "SP2";
        int sapxep = 0;
        int expResult = 2;

        ArrayList<SanPhamDTO> result = instance.timKiem_MaSP(strMaSP1, strMaSP2, sapxep);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of timKiem_SoLuong method, of class SanPhamBUS.
     */
    @Test
    public void testTimKiem_SoLuong() {
        System.out.println("timKiem_SoLuong");
        int SL1 = 0;
        int SL2 = 5;
        int sapxep = 0;
        int expResult = 5;
        ArrayList<SanPhamDTO> result = instance.timKiem_SoLuong(SL1, SL2, sapxep);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of kiemTraKhoachinh method, of class SanPhamBUS.
     */
    @Test
    public void testKiemTraKhoachinh() {
        System.out.println("kiemTraKhoachinh");
        boolean result = instance.kiemTraKhoachinh(sp);
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of timKiem_TenGiay method, of class SanPhamBUS.
     */
    @Test
    public void testTimKiem_TenGiay() {
        System.out.println("timKiem_TenGiay");
        String strTenGiay = "SuperStar";
        int expResult = 1;
        ArrayList<SanPhamDTO> result = instance.timKiem_TenGiay(strTenGiay);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of timKiem_MaLoai method, of class SanPhamBUS.
     */
    @Test
    public void testTimKiem_MaLoai() {
        System.out.println("timKiem_MaLoai");
        String strMaLoai = "3";
        int expResult = 4;
        ArrayList<SanPhamDTO> result = instance.timKiem_MaLoai(strMaLoai);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of timKiem_MaXX method, of class SanPhamBUS.
     */
    @Test
    public void testTimKiem_MaXX() {
        System.out.println("timKiem_MaXX");
        String strMaXX = "VN";
        int expResult = 1;
        ArrayList<SanPhamDTO> result = instance.timKiem_MaXX(strMaXX);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of timKiem_MaMau method, of class SanPhamBUS.
     */
    @Test
    public void testTimKiem_MaMau() {
        System.out.println("timKiem_MaMau");
        String strMaMau = "WT";
        int expResult = 2;
        ArrayList<SanPhamDTO> result = instance.timKiem_MaMau(strMaMau);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of timKiem_MaThuongHieu method, of class SanPhamBUS.
     */
    @Test
    public void testTimKiem_MaThuongHieu() {
        System.out.println("timKiem_MaThuongHieu");
        String strMaThuongHieu = "AD";
        int expResult = 1;
        ArrayList<SanPhamDTO> result = instance.timKiem_MaThuongHieu(strMaThuongHieu);
        assertEquals(expResult, result.size());
    }

    /**
     * Test of them method, of class SanPhamBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        int preSize = instance.getNumbSanPham();
        Boolean result = instance.them(sp);
        int curSize = instance.getNumbSanPham();
        if(result){
            assertEquals(preSize + 1, curSize);
        }else{
            assertEquals(preSize, curSize);
        }
    }

    /**
     * Test of xoa method, of class SanPhamBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        int preSize = instance.getNumbSanPham();
        Boolean result = instance.xoa(sp);
        int curSize = instance.getNumbSanPham();
        if(result){
            assertEquals(preSize - 1, curSize);
        }else{
            assertEquals(preSize, curSize);
        }
    }

    /**
     * Test of sua method, of class SanPhamBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        SanPhamDTO hd = sp;
        String expMaMau = "BLU";
        hd.setStrMaMau(expMaMau);
        Boolean result = instance.sua(hd);
        String actualMaMau = instance.getInfor(hd.getStrMaGiay()).getStrMaMau();
        if(result){
            assertEquals(expMaMau, actualMaMau);
        }else{
            assertEquals(sp.getStrMaMau(), actualMaMau);
        }
    }

}
