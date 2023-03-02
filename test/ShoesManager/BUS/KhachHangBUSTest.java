/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.BUS;

import ShoesManager.DTO.KhachHangDTO;
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
public class KhachHangBUSTest {

    KhachHangBUS instance;

    KhachHangDTO kh;

    public KhachHangBUSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        instance = new KhachHangBUS();
        kh = new KhachHangDTO("KH7", "abc", "abc", "abc", "abc", "abc@gmail.com", "vip", 0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNumbKH method, of class KhachHangBUS.
     */
    @Test
    public void testGetNumbKH() {
        System.out.println("getNumbKH");

        int expResult = 6;
        int result = instance.getNumbKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getList_KH method, of class KhachHangBUS.
     */
    @Test
    public void testGetList_KH() {
        System.out.println("getList_KH");
        int expResult = 6;
        ArrayList<KhachHangDTO> result = instance.getList_KH();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setList_KH method, of class KhachHangBUS.
     */
    @Test
    public void testSetList_KH() {
        System.out.println("setList_KH");
        instance.setList_KH(new ArrayList<>());
        int expResult = 0;
        int actualResult = instance.getNumbKH();
        assertEquals(expResult, actualResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInfor method, of class KhachHangBUS.
     */
    @Test
    public void testGetInfor() {
        System.out.println("getInfor");
        String strMaKH = "KH1";
        String expEmailResult = "nguyenanh@gmail.com";
        KhachHangDTO result = instance.getInfor(strMaKH);
        assertEquals(expEmailResult, result.getStrEmail());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of them method, of class KhachHangBUS.
     */
    @Test
    public void testThem() throws Exception {
        System.out.println("them");
        int preSize = instance.getNumbKH();
        Boolean result = instance.them(kh);
        int curSize = instance.getNumbKH();
        if (result) {
            assertEquals(preSize + 1, curSize);
        } else {
            assertEquals(preSize, curSize);
        }
    }

    /**
     * Test of xoa method, of class KhachHangBUS.
     */
    @Test
    public void testXoa() throws Exception {
        System.out.println("xoa");
        int preSize = instance.getNumbKH();
        Boolean result = instance.xoa(kh);
        int curSize = instance.getNumbKH();
        if (result) {
            assertEquals(preSize - 1, curSize);
        } else {
            assertEquals(preSize, curSize);
        }
    }

    /**
     * Test of sua method, of class KhachHangBUS.
     */
    @Test
    public void testSua() throws Exception {
        System.out.println("sua");
        KhachHangDTO khUpdate = kh;
        khUpdate.setStrGioiTinh("Nu");
        Boolean result = instance.sua(kh);
        String actualGioiTinh = instance.getInfor("KH7").getStrGioiTinh();
        if (result) {

            assertEquals(khUpdate.getStrGioiTinh(), actualGioiTinh);
        } else {
            assertEquals(kh.getStrGioiTinh(), actualGioiTinh);
        }
    }

}
