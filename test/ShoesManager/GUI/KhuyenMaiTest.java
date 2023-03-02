package ShoesManager.GUI;

import static org.junit.Assert.assertEquals;

import javax.swing.SwingUtilities;

import org.junit.*;


public class KhuyenMaiTest {
	private KhuyenMai khuyenmai;
	@Before
	public void setUp() throws Exception {
		khuyenmai = new KhuyenMai();
	}
	
	@Test 
	public void testInitUI() throws Exception {
		// test GUI group btnChiTiet
		assertEquals(khuyenmai.btnChiTiet_Sua.getText(), "Sửa");
		assertEquals(khuyenmai.btnChiTiet_TaoMoi.getText(), "Tạo mới");
		assertEquals(khuyenmai.btnChiTiet_Them.getText(), "Thêm");
		assertEquals(khuyenmai.btnChiTiet_Xoa.getText(), "Xóa");
		// test GUI group btnThongtin
		assertEquals(khuyenmai.btnThongTin_Sua1.getText(), "Sửa");
		assertEquals(khuyenmai.btnThongTin_Them.getText(), "Thêm");
		assertEquals(khuyenmai.btnThongTin_Trong.getText(), "Tạo Mới");
		assertEquals(khuyenmai.btnThongTin_Xoa.getText(), "Xóa");
		// test GUI group btnTimKiem
		assertEquals(khuyenmai.btnTimKiem_HuyTimKiem.getText(), "Hủy tìm kiếm");
		assertEquals(khuyenmai.btnTimKiem_TimKiem.getText(), "Tìm kiếm");
		assertEquals(khuyenmai.btnTimKiem_Trong1.getText(), "Trống");
	}
	
	@Test 
	public void testSuaKhuyenMai() throws Exception{
		int rowToClick = 0;
        SwingUtilities.invokeLater(() -> {
        	khuyenmai.tblThongTin.setRowSelectionInterval(rowToClick, rowToClick);
        	khuyenmai.tblThongTin.changeSelection(rowToClick, 0, false, false);
        	khuyenmai.tblThongTin.requestFocusInWindow();
        	khuyenmai.tblThongTin.editCellAt(rowToClick, 0);
        });
        assertEquals(rowToClick, khuyenmai.tblThongTin.getSelectedRow());
        int index = khuyenmai.tblThongTin.getSelectedRow();
        String expectMaKm = (String)khuyenmai.tblThongTin.getValueAt(index, 0);
        String actualMaKm = khuyenmai.tfThongTin_MAKM.getText();
        assertEquals(expectMaKm, actualMaKm);
	}
	
	@Test
	public void testThemKhuyenMai() throws InterruptedException {
		int dataLength = khuyenmai.tblThongTin.getRowCount();
		khuyenmai.tfThongTin_MAKM.setText("KM7");
		khuyenmai.cbbThongTin_Loai.setSelectedIndex(0);
		khuyenmai.tfThongTin_TenKM.setText("admin");
		khuyenmai.cbbThongTin_DK.setSelectedIndex(0);
		khuyenmai.calendarThongTin.setDate(new java.util.Date(1590147174000L));
		khuyenmai.calendarThongTin1.setDate(new java.util.Date(1590147174000L));
		khuyenmai.btnThongTin_Trong.doClick();
		Thread.sleep(1000);
		assertEquals(khuyenmai.tblThongTin.getRowCount(), dataLength+1);
	}
	
	@Test
	public void testXoaKhuyenMai() throws Exception {
		int dataLength = khuyenmai.tblThongTin.getRowCount();
		int rowToClick = 0;
        SwingUtilities.invokeLater(() -> {
        	khuyenmai.tblThongTin.setRowSelectionInterval(rowToClick, rowToClick);
        	khuyenmai.tblThongTin.changeSelection(rowToClick, 0, false, false);
        	khuyenmai.tblThongTin.requestFocusInWindow();
        	khuyenmai.tblThongTin.editCellAt(rowToClick, 0);
        });
        khuyenmai.btnThongTin_Xoa.doClick();
        Thread.sleep(1000);
		assertEquals(khuyenmai.tblThongTin.getRowCount(), dataLength-1);
	}
	
	@After
	public void tearDown() throws Exception {
		khuyenmai = null;
	}
}
