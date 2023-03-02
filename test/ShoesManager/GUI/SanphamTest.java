/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.GUI;

import ShoesManager.BUS.SanPhamBUS;
import ShoesManager.DTO.SanPhamDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author LNhutDuy
 */
public class SanphamTest {
    private Sanpham spGUI;
    public SanphamTest() throws Exception {
        
    }

    @Test
    public void testInit() throws Exception {
    }
    
     @Before
    public void setUp() throws Exception {
        spGUI = new Sanpham();
    }

    @After
    public void tearDown() throws Exception {
        spGUI =null;
    }
    
        @Test
    public void testActionButtondisplay() throws Exception {
        DefaultTableModel expectedModel = new DefaultTableModel();
        expectedModel.addColumn("Mã Giày");
        expectedModel.addColumn("Tên Giày");
        expectedModel.addColumn("Số lượng");
        expectedModel.addColumn("Giá");
        expectedModel.addColumn("Size");
        expectedModel.addColumn("Đối tượng sd");
        expectedModel.addColumn("Chất liệu");
        expectedModel.addColumn("Mã Loại");
        expectedModel.addColumn("Mã Xuất Xứ");
        expectedModel.addColumn("Mã Màu");
        expectedModel.addColumn("Mã Thương hiệu");

        SanPhamDTO sp1 = new SanPhamDTO("SP007", "Giày thể thao Nike", "Nam", "Da", "2", "US", "WT", "AD", 5, 200, 30);
        SanPhamDTO sp2 = new SanPhamDTO("SP008", "Giày thể thao Adidas", "Nam", "Da", "2", "US", "WT", "AD", 5, 200, 30);
        List<SanPhamDTO> listSP = new ArrayList<SanPhamDTO>();
        listSP.add(sp1);
        listSP.add(sp2);
        expectedModel.addRow(sp1.toObject());
        expectedModel.addRow(sp2.toObject());
        Sanpham sp = new Sanpham();
        sp.list_SP.setList_SP((ArrayList<SanPhamDTO>) listSP);
        sp.actionButtondisplay();
        DefaultTableModel actualModel = (DefaultTableModel) sp.getTblThongTin().getModel();
        
        System.out.println(expectedModel.getColumnCount()+ "-----"+actualModel.getColumnCount());
        // Kiểm tra số lượng cột
        assertEquals(actualModel.getColumnCount(), expectedModel.getColumnCount());

        // Kiểm tra tên cột
        for (int i = 0; i < expectedModel.getColumnCount(); i++) {
            assertEquals(expectedModel.getColumnName(i), actualModel.getColumnName(i));
        }

        // Kiểm tra số lượng dòng
        assertEquals(expectedModel.getRowCount(), actualModel.getRowCount());

        // Kiểm tra giá trị của các ô
        for (int i = 0; i < expectedModel.getRowCount(); i++) {
            for (int j = 0; j < expectedModel.getColumnCount(); j++) {
                assertEquals(expectedModel.getValueAt(i, j), actualModel.getValueAt(i, j));
            }
        }
    }
    
    @Test
    public void testThem_XoaSanPham() throws Exception {
        int ListSizeBeFore = spGUI.list_SP.getSize();
        String MaSpTest = spGUI.list_SP.getDefaultMaHD();
        spGUI.NhapSanphamMoi(MaSpTest , "Anidas", "NiLon", "Nam", "200", "30", 1, 1 ,1 ,1);
        spGUI.getBtnLuu().setEnabled(true);
        spGUI.getBtnLuu().doClick();
        int ListSizeAfter = spGUI.list_SP.getSize();
        System.out.println(ListSizeBeFore+"---"+ListSizeAfter);
        assertEquals(ListSizeBeFore+1, ListSizeAfter);   
        spGUI.getTfMaGiay().setText(MaSpTest);
        spGUI.getBtnXoa().setEnabled(true);
        spGUI.getBtnXoa().doClick();
        ListSizeAfter = spGUI.list_SP.getSize();
        assertEquals(ListSizeBeFore+1, ListSizeAfter);  
    }

    
    @Test
    public void testSuaSanPham() throws Exception {
        SanPhamDTO SpTestBefore = spGUI.list_SP.getInfor("SP1");
        int GiaBf = SpTestBefore.getiGia();
        String NameT = SpTestBefore.getStrTenGiay();
        spGUI.NhapSanphamMoi("SP1", SpTestBefore.getStrTenGiay(), "NiLon", "Nam",  (SpTestBefore.getiGia()+1)+"", "29", 1, 1 ,1 ,1);
        spGUI.getTfSoLuong().setText(SpTestBefore.getiSoLuong()+"");
        spGUI.getBtnSua().setEnabled(true);
        spGUI.getBtnSua().doClick();
        SanPhamDTO SpTestAfter = spGUI.list_SP.getInfor("SP1");
        assertEquals(GiaBf+1, SpTestAfter.getiGia());   
    }
        

    
    
}
