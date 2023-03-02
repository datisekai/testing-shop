/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.GUI;

import ShoesManager.DTO.ChiTietHDDTO;
import ShoesManager.DTO.ChiTietKMDTO;
import ShoesManager.DTO.HoaDonDTO;
import ShoesManager.DTO.KhuyenMaiDTO;
import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HoaDonTest {

    private HoaDon hd;

    @Before
    public void setUp() throws Exception {
        hd = new HoaDon();
    }

    @After
    public void tearDown() throws Exception {
        hd = null;
    }
    
    
    @Test
    public void testShowHD() throws Exception {
        DefaultTableModel expectedModel = new DefaultTableModel();
        expectedModel.addColumn("Mã HĐ");
        expectedModel.addColumn("Mã KH");
        expectedModel.addColumn("Mã NV");
        expectedModel.addColumn("Mã KM");
        expectedModel.addColumn("Ngày Bán");
        expectedModel.addColumn("Tổng Tiền");
        String ngayBan = "01 01 2023";
        HoaDonDTO hd1, hd2;
        hd1 = new HoaDonDTO("HD0010", "admin", "KH1", "KM1", ngayBan, 200);
        hd2 = new HoaDonDTO("HD0011", "admin", "KH2", "KM2", ngayBan, 300);        
        List<HoaDonDTO> listHD = new ArrayList<HoaDonDTO>();
        listHD.add(hd1);
        listHD.add(hd2);
        expectedModel.addRow(hd1.toObject());
        expectedModel.addRow(hd2.toObject());
        HoaDon hdTest = new HoaDon();
        hdTest.list_HD.setList_HD((ArrayList<HoaDonDTO>) listHD);
        hdTest.actionButtondisplay();
        DefaultTableModel actualModel = (DefaultTableModel) hdTest.getTblThongTin().getModel();
        
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
    public void testShowCTHD() throws Exception {
        HoaDon cthdTest = new HoaDon();
        DefaultTableModel expectedModel = new DefaultTableModel();
        expectedModel.addColumn("Mã Sản Phẩm");
        expectedModel.addColumn("Mã Hóa Đơn");
        expectedModel.addColumn("Số Lượng");
        expectedModel.addColumn("Giá Bán");
        expectedModel.addColumn("Mã Khuyến Mãi");
        expectedModel.addColumn("Tỉ Lệ KM");
        String ngayBan = "01 01 2023";
        HoaDonDTO hd1, hd2;
        hd1 = new HoaDonDTO("HD0010", "admin", "KH1", "KM1", ngayBan, 200);
        hd2 = new HoaDonDTO("HD0011", "admin", "KH2", "KM2", ngayBan, 300);        
        List<HoaDonDTO> listHD = new ArrayList<HoaDonDTO>();
        listHD.add(hd1);
        listHD.add(hd2);
        ChiTietHDDTO CThd1, CThd2;
        ChiTietKMDTO CTkm1, CTkm2;
        CThd1 = new ChiTietHDDTO( "SP1", "HD0010", 1, 200);
        CThd2 = new ChiTietHDDTO( "SP2", "HD0011", 1, 200);
        CTkm1 = new ChiTietKMDTO("", "SP1", 0);
        CTkm2 = new ChiTietKMDTO("", "SP2", 0);
        List<ChiTietHDDTO> listCTHD = new ArrayList<ChiTietHDDTO>();
        listCTHD.add(CThd1);
        listCTHD.add(CThd2);
        List<ChiTietKMDTO> listCTKM = new ArrayList<ChiTietKMDTO>();
        listCTKM.add(CTkm1);
        listCTKM.add(CTkm2);
        expectedModel.addRow(new Object[] {"SP1", "HD0010", 1, 200, CTkm1.getStrMaKM(), "0%"});
        expectedModel.addRow(new Object[] {"SP2", "HD0011", 1, 200, CTkm2.getStrMaKM(),"0%"});
       
        cthdTest.getList_ChiTietHD().setList_HD((ArrayList<ChiTietHDDTO>) listCTHD);
        cthdTest.actionButtondisplayChiTiet();
        DefaultTableModel actualModel = (DefaultTableModel) cthdTest.getTblThongTin1().getModel();
        
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
    public void testBtnThongTin_ThemActionPerformed() throws Exception {
        // Thiết lập các giá trị đầu vào
        int sizeListBefore = hd.list_HD.getList_HD().size();
        String maKMTest = hd.list_KM.getDefaultMaKM();
        String maHdTest = hd.list_HD.getDefaultMaHD();
        String ngayBatDau = "01 01 2023";
        String ngayKetThuc = "31 01 2023";
        KhuyenMaiDTO km = new KhuyenMaiDTO(maKMTest, "Test", "Loai 1", "Test", ngayBatDau, ngayKetThuc);
        hd.list_KM.them(km);
        hd.getCbbThongTin_MaKM().setSelectedItem(maKMTest);
        // Gọi phương thức để kiểm tra
        hd.getBtnThongTin_Them().setEnabled(true);
        hd.getBtnThongTin_Them().doClick();
        // Kiểm tra kết quả
        System.out.println("");
        assertTrue(hd.list_HD.getList_HD().size() > sizeListBefore);
    }
    
    @Test
    public void testBtnChiTiet_ThemActionPerformed() throws Exception {
        // Thiết lập các giá trị đầu vào
        int sizeListBefore = hd.getList_ChiTietHD().getList_HD().size();
        String maKMTest = hd.list_KM.getDefaultMaKM();
        String maHdTest = hd.list_HD.getDefaultMaHD();
        hd.getHoadon().setStrMaHD("HD002");
        String MaHD = "HD002";
        String MaSP = "SP1";
        hd.getTfChiTiet_MaHD().setEditable(true);
        hd.getTfChiTiet_MaSP().setEditable(true);
        hd.getTfThongTin_MaHD().setText(MaHD);
        hd.getTfChiTiet_MaHD().setText(MaHD);
        hd.getTfChiTiet_MaSP().setText(MaSP);
        hd.getTfChiTiet_Gia().setText(200+"");
        hd.getTfChiTiet_SL().setText(1+"");
        hd.getBtnChiTiet_Them().setEnabled(true);
        hd.getBtnChiTiet_Them().doClick();
        // Kiểm tra kết quả
        System.out.println("");
        assertTrue(hd.getList_ChiTietHD().getList_HD().size() > sizeListBefore);
    }
    
    @Test
    public void btnThongTin_XoaActionPerformed() throws Exception {

        
    }
}